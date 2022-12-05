package core;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.Point;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	 
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void selecionarCombo(By by, String valor) {
		getDriver().findElement(by).click();
		clicar(By.xpath("//*[@text='" + valor + "']"));
	}

	public int elementoExiste(By by) {
		return getDriver().findElements(by).size();
	}

	public void aguardarElementoVisivel(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 45);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	@SuppressWarnings("rawtypes")
	public void rolarTela(double inicio, double fim) {
		Dimension tamanho = getDriver().manage().window().getSize();
		int coordX = tamanho.width / 2;
		int coordYInicial = (int) (tamanho.height * inicio);
		int coordYFinal = (int) (tamanho.height * fim);
		TouchAction ts = new TouchAction(getDriver());
		ts.longPress(PointOption.point(coordX, coordYInicial)).moveTo(PointOption.point(coordX, coordYFinal)).release().perform();
	}
	
	public void atualizarTimeout(int tempo) {
		getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}
	
	public void pressionarEnter() {
		getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void pressionarBuscar() {
		getDriver().pressKey(new KeyEvent(AndroidKey.SEARCH));
	}
	
	/*public void retornarTimeout() {
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void aumentarTimeout() {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}*/
	
	public void esconderTeclado() {
		getDriver().hideKeyboard();
	}
	
	public void voltarAndroid() {
		getDriver().navigate().back();
	}
	
	public void esperar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public boolean verificarExistenciaElementoTexto(String texto) {
		List<MobileElement> elementos = getDriver().findElementsByXPath("//*[@content-desc = '" + texto + "']");
		return elementos.size() > 0;
	}
	
	public void cliqueLongo(By by) {
		AndroidTouchAction touch = new AndroidTouchAction(getDriver());
        touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(getDriver().findElement(by)))).perform();
    }
	
	   @SuppressWarnings("rawtypes")
	    public void scroll(int fromX, int fromY, int toX, int toY) {
	        TouchAction touchAction = new TouchAction(getDriver());
	        touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
	   }

	   public void scrollDown() {
	        int pressX = getDriver().manage().window().getSize().width / 2;
	        int bottomY = getDriver().manage().window().getSize().height * 4 / 5;
	        int topY = getDriver().manage().window().getSize().height / 8;
	        scroll(pressX, bottomY, pressX, topY);
	    }
	   
	   public void dragDrop(By by, By by2) {
		   WebElement origem = getDriver().findElement(by);
		   WebElement destino = getDriver().findElement(by2);
		   TouchAction dragNDrop = new TouchAction(getDriver()).longPress(ElementOption.element(origem)).moveTo(ElementOption.element(destino)).release();
		   dragNDrop.perform();
	   }
	   
	   public Point coordEl(String xpath) {
		   MobileElement element = getDriver().findElementByXPath(xpath);
		   Point location = element.getLocation();
		   return location;
	   }
	   
	   public void scrollEsquerda(String coord) {
		   String xy = coord.substring(0, coord.length()-1);
		   int pressY = Integer.parseInt(xy.split(", ")[1]);
		   int rightX = getDriver().manage().window().getSize().width * 4 / 5;
		   int leftX = getDriver().manage().window().getSize().width / 8;
		   scroll(rightX, pressY, leftX, pressY);
	   }
	   
	   public void scrollDireita(String coord) {
		   String xy = coord.substring(0, coord.length()-1);
		   int pressY = Integer.parseInt(xy.split(", ")[1]);
		   int rightX = getDriver().manage().window().getSize().width / 8;
		   int leftX = getDriver().manage().window().getSize().width * 4 / 5;
		   scroll(rightX, pressY, leftX, pressY);
	   }
	   
	   @SuppressWarnings("rawtypes")
	    public void clicarBotaoExato(By by) {
	        MobileElement element = getDriver().findElement(by);
	        Point x = element.getLocation();
	        
	        new TouchAction(getDriver()).tap(ElementOption.point(x)).perform();
	    }
}
