package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import core.BaseTest;

public class ConfigFileReader {

	private static final Path currentRelativePath = Paths.get("");
	private static final String currentPath = currentRelativePath.toAbsolutePath().toString();
	
	private static final String propertyFilePath = currentPath + "\\src\\test\\resources\\configs\\config.properties";	

	private Properties properties;
	
	private static Properties properties_massa;

	public ConfigFileReader() {
		
		try {
			BufferedReader readerProperties = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(readerProperties);
				readerProperties.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
	}
	
	public Properties massaCorretaParaTeste() {
		String teste = BaseTest.testName;
		
		switch (teste) {
		case "Exemplo":
			//properties_massa = properties_massa_CT001;
			break;
		}
		
		return properties_massa;
	}
	
	public String getDevice() {
		String device = properties.getProperty("device");
		new ConfigFileReader();
		return device;
	}
}
