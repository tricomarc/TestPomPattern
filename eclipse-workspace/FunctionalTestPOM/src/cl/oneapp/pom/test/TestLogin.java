package cl.oneapp.pom.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TestLogin {
	
	
	WebDriver driver;
	LoginPage loginPage;
  @Test
  public void Test_1_ingresoUsuarios() throws InterruptedException {
	  
	  loginPage.ingresoUsuario();
	  Thread.sleep(2000);
	  assertTrue(loginPage.ingresoExitoso());
	  
  }
  @BeforeClass
  public void beforeClass() {
	  loginPage = new LoginPage(driver);
	  driver= loginPage.chromWebDriverConection();
	  loginPage.visit("https://demo.oneapp.cl/admin/admin/administradores/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
