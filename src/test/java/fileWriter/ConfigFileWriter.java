package fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;

public class ConfigFileWriter {

	private static final Path currentRelativePath = Paths.get("");
	private static final String currentPath = currentRelativePath.toAbsolutePath().toString();
	private static final String propertyFilePath = currentPath + "\\src\\test\\resources\\configs\\config.properties";

	public ConfigFileWriter(String email, String senha)
			throws Exception {
		try {
			File file = new File("");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));

//			writer.write("email = " + email);
//			writer.newLine();
//			writer.write("senha = " + senha);

			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(
					"ARQUIVO (Configuration.properties) NÃO ENCONTRADO NO CAMINHO ESPECIFICADO: " + propertyFilePath);
		}
	}
}
