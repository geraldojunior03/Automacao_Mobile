package managers;

import fileWriter.ConfigFileWriter;

public class FileWriterManager {

	private static FileWriterManager fileWriterManager = new FileWriterManager();
	private static ConfigFileWriter configFileWriter;

	private FileWriterManager() {
	}

	public static FileWriterManager getInstance() {
		return fileWriterManager;
	}

	public ConfigFileWriter getConfigWriter(String email, String senha) throws Exception {
		return (configFileWriter == null) ? new ConfigFileWriter(email, senha) : configFileWriter;
	}
}
