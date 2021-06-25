package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompararStep {
	WebDriver driver = null;
	@Given("abrir el navegador")
	public void abrir_el_navegador() {
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@When("ir a la pagina de lenovo")
	public void ir_a_la_pagina_de_lenovo() {
	    
	}

	@And("seleccionar primera laptop")
	public void seleccionar_primera_laptop() {
	    
	}

	@When("agregar a la comparacion la primera laptop")
	public void agregar_a_la_comparacion_la_primera_laptop() {
	    
	}

	@And("seleccionar la segunda laptop")
	public void seleccionar_la_segunda_laptop() {
	    
	}

	@When("agregar a la comparacion la segunda laptop")
	public void agregar_a_la_comparacion_la_segunda_laptop() {
	   
	}

	@Then("obtener datos de la especificaciones")
	public void obtener_datos_de_la_especificaciones() {
	    
	}
}
