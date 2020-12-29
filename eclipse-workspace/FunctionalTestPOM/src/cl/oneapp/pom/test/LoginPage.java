package cl.oneapp.pom.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
	
	By txtUser = By.xpath("//*[@id=\"AdministradorUsuario\"]");
	  
	By txtPassword = By.xpath("//*[@id=\"AdministradorClave\"]");
	  
	By btnIngresar = By.xpath("//*[@id=\"AdministradorAdminLoginForm\"]/div[4]/div/button");
	  
	By loginForm  = By.xpath("//*[@id=\"AdministradorAdminLoginForm\"]");  
	
	By nombreUsuario = By.xpath("//*[@id=\"userbox\"]/a/div/span[1]/b");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void ingresoUsuario() throws InterruptedException {
		Thread.sleep(2000);
		if (isDisplayed(loginForm)) {
			type("admin", txtUser);
			type("andain5546", txtPassword);
			click(btnIngresar);
		}else {
			System.out.println("Formulario de login no encontrado");
		}
	}
	
	public boolean ingresoExitoso() { 
		return isDisplayed(nombreUsuario);
	}


}
