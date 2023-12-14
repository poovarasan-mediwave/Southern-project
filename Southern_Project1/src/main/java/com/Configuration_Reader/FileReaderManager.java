package com.Configuration_Reader;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static Configuration_Reader getInstanceCR() throws IOException {

		Configuration_Reader reader = new Configuration_Reader();

		return reader;
	}
}
