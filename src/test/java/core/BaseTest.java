package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	private static int novaExecucao = 1;

	private static String execucaoID = "";

	public static String testName;

	private static String deviceName;

	public static int contadorPassos = 1;

	public static void idRemoteDevice() { //CONEXÃO FARM

		switch (DriverFactory.device) {

		case ("5e4a85b78147371dd9dce1d8"):
			deviceName = "Galaxy A30";
			break;
		case ("5e4a84fe8147371dd9dcdfcc"):
			deviceName = "Galaxy S5";
			break;
		case ("5e4a85248147371dd9dce03c"):
			deviceName = "Galaxy S9";
			break;
		case ("5e4a84588147371dd9dcddef"):
			deviceName = "Moto G4";
			break;
		case ("5e4a847f8147371dd9dcde68"):
			deviceName = "Moto G5";
			break;
		case ("5e60f96f7f29401a3fefe52e"):
			deviceName = "Moto G6";
			break;
		case ("5e4a84278147371dd9dcdd4f"):
			deviceName = "Xiaomi Mi 8 Lite";
			break;
		case ("5e4a86398147371dd9dce37f"):
			deviceName = "iPhone 6";
			break;
		case ("5e4a86578147371dd9dce3ed"):
			deviceName = "iPhone 7";
			break;
		case ("5e4a860e8147371dd9dce2f8"):
			deviceName = "iPhone XR";
			break;
		}
	}

	public static void geraScreenshot(String screen) {

		if (novaExecucao == 1) {
			execucaoID = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
			novaExecucao = 0;

			try {
				Process process = Runtime.getRuntime().exec("adb shell getprop ro.product.model");
				// for data access
				BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
				while ((deviceName = br.readLine()) != null) {
					break;
				}
				
				if(deviceName == null) {
					idRemoteDevice();
				}
				
				br.close();
				// do whatever you want with sb content
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		try {
			File arquivo = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			String diretorio = "target\\evidencias\\" + testName + "\\" + deviceName + "\\" + execucaoID + "\\"
					+ "Passo " + contadorPassos + " - " + screen + ".jpg";
			FileUtils.copyFile(arquivo, new File(diretorio));
			contadorPassos++;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
