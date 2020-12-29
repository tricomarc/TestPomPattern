package cl.oneapp.pom.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	//Declaramos el objeto WebDriver
	private WebDriver driver;
	
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 *Método que permite la conexión con Chrome
	 */
	public WebDriver chromWebDriverConection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mlazo\\eclipse-workspace\\FunctionalTestPOM\\DriverNavegadores\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * Método que permite identificar un elemento
	 */
	public WebElement findElement(By localizador) {
		return driver.findElement(localizador);
	}
	
	
	/*
	 * Método que retorna una lista de elementos
	 */
	public List<WebElement> findElements(By localizador){
		return driver.findElements(localizador);
	}
	
	/*
	 * Devuelve el texto del localizador que estamos buscando
	 */
	
	public String getText(WebElement element) {
		
		return element.getText();
	}
	
	/*
	 * Devuelve el texto que buscamos a travez de un localizador
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	
	/*
	 * Permite escribir texto en un elemento
	 */
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	/*
	 * Método para hacer click
	 */
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/*
	 * Retorna true si el elemento esta disponible en la página
	 */
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
			
		} catch (org.openqa.selenium.NoSuchElementException e) {


			return false;
		}
	}
	
	/*
	 * Encargado de recibir la url y abrir la página
	 */
	public void visit(String url) {
		driver.get(url);
	}
}
