/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.whip.coveragedata;

import com.liferay.whip.agent.InstrumentationAgent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * @author Shuyang Zhou
 */
public class ProjectDataUtil {

	public static ProjectData captureProjectData(boolean saveSessionData) {
		String className = ProjectDataUtil.class.getName();

		synchronized (className.intern()) {
			try (RandomAccessFile randomAccessFile = new RandomAccessFile(
					InstrumentationAgent.getLockFile(), "rw")) {

				FileChannel fileChannel = randomAccessFile.getChannel();

				FileLock fileLock = fileChannel.lock();

				try {
					File dataFile = new File(
						System.getProperty(
							"net.sourceforge.cobertura.datafile"));

					if (dataFile.exists()) {
						_projectData.merge(_readProjectData(dataFile));

						dataFile.delete();
					}

					if (saveSessionData) {
						_writeProjectData(_projectData, dataFile);
					}

					return _projectData;
				}
				finally {
					fileLock.release();
				}
			}
			catch (IOException ioe) {
				throw new RuntimeException(ioe);
			}
		}
	}

	public static ProjectData getProjectData() {
		return _projectData;
	}

	private static ProjectData _readProjectData(File dataFile) {
		try (FileInputStream fileInputStream = new FileInputStream(dataFile);
			ObjectInputStream objectInputStream = new ObjectInputStream(
				fileInputStream)) {

			return (ProjectData)objectInputStream.readObject();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static void _writeProjectData(
		ProjectData projectData, File dataFile) {

		try (FileOutputStream fileOutputStream = new FileOutputStream(dataFile);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				fileOutputStream)) {

			objectOutputStream.writeObject(projectData);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static final ProjectData _projectData = new ProjectData();

}