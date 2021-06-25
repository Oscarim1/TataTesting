package steps;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import pages.CompararPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVWriter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompararStep {
	
	By btnInput = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/ul/li[1]/div/div/div/span[2]");
	By input1 = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/ul/li[1]/div/div/div/span[2]/div/div/div[1]/input");
	By btnSeleccionar = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/ul/li[1]/div/div/div/span[2]/div/div/div[2]/ul/li[1]/div");
	By btnInput2 = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/ul/li[2]/div/div/div/span[2]");
	By input2 = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/ul/li[2]/div/div/div/span[2]/div/div/div[1]/input");
	By btnSeleccionar2 = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/ul/li[2]/div/div/div/span[2]/div/div/div[2]/ul/li[1]/div");
	By btnComparar = By.xpath("//*[@id=\"app\"]/div[4]/div[5]/div/button");
	By txtSummary = By.xpath("//*[@id=\"app\"]/div[4]/h5");
	By table = By.xpath("//*[@id=\"app\"]/div[4]/div[6]/div[1]/div[2]/div[1]/table");
	
	//CompararPage page=null;
	WebDriver driver = null;
	@Given("abrir el navegador")
	public void abrir_el_navegador() throws InterruptedException {
		try {
			String projectPath = System.getProperty("user.dir");
		    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		    driver = new ChromeDriver();
		    //Thread.sleep(5000);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("ir a la pagina de lenovo")
	public void ir_a_la_pagina_de_lenovo() throws InterruptedException {
		driver.navigate().to("https://www.gadgetsnow.com/compare-laptops");
		Thread.sleep(5000);
	}

	@And("seleccionar primera laptop")
	public void seleccionar_primera_laptop() throws InterruptedException {
		driver.findElement(btnInput).click();;
		Thread.sleep(5000);
		driver.findElement(input1).sendKeys("e41-80");
		Thread.sleep(5000);
	}

	@When("agregar a la comparacion la primera laptop")
	public void agregar_a_la_comparacion_la_primera_laptop() throws InterruptedException {
		driver.findElement(btnSeleccionar).click();
		Thread.sleep(5000);
	}

	@And("seleccionar la segunda laptop")
	public void seleccionar_la_segunda_laptop() throws InterruptedException {
		driver.findElement(btnInput2).click();;
		Thread.sleep(5000);
		driver.findElement(input2).sendKeys("b40-80");
		Thread.sleep(5000);
	}

	@When("agregar a la comparacion la segunda laptop")
	public void agregar_a_la_comparacion_la_segunda_laptop() throws InterruptedException {
		driver.findElement(btnSeleccionar2).click();
		Thread.sleep(5000);
	}
	
	@And("comparar los laptops")
	public void comparar_los_laptops() throws InterruptedException {
		driver.findElement(btnComparar).click();
		Thread.sleep(5000);
	}

	@Then("obtener datos de la especificaciones")
	public void obtener_datos_de_la_especificaciones() throws IOException, InterruptedException {
		CSVWriter write = new CSVWriter(new FileWriter("testData//ejemplo1.csv"));
		
		int lengthTitle = 6;
		int lengthDescription = 6;
		int lengthDescription2 = 6;
		String [] title = new String[lengthTitle];
		String [] description = new String[lengthDescription];
		String [] description2 = new String[lengthDescription2];
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement elemento = driver.findElement(txtSummary);
		 //Script to scroll	
	    js.executeScript("arguments[0].scrollIntoView();", elemento);
	    
	    String beforeXpath = "//*[@id=\"app\"]/div[4]/div[6]/div[1]/div[2]/div[1]/table/tbody/tr[";
	    String afterXpath = "]/th";
	    
	    for(int i = 1; i<=5; i++) {
	    	String actualXpath = beforeXpath+i+afterXpath;
	    	WebElement element = driver.findElement(By.xpath(actualXpath));
	    	title[i] = element.getText();
	    	System.out.println(title[i]);
	    	//System.out.println(element.getText());
	    		
	    }
	    Thread.sleep(5000);
	   
	    String complementXpath = "]/td[1]";
	    for(int i = 1; i<=5; i++) {
	    	String actualXpath = beforeXpath+i+complementXpath;
	    	WebElement element = driver.findElement(By.xpath(actualXpath));
	    	description[i] = element.getText();
	    	System.out.println(description[i]);
	    	//System.out.println(element.getText());
	    }
	    Thread.sleep(5000);
	    
	    String endXpath = "]/td[2]";
	    for(int i = 1; i<=5; i++) {
	    	String actualXpath = beforeXpath+i+endXpath;
	    	WebElement element = driver.findElement(By.xpath(actualXpath));
	    	description2[i] = element.getText();
	    	System.out.println(description2[i]);
	    	//System.out.println(element.getText());
	    		
	    }
	    Thread.sleep(5000);
	    
	    List list = new ArrayList();
	    list.add(title);
	    list.add(description);
	    list.add(description2);
	    
	    write.writeAll(list);
	    write.flush();
	    /*
	    List<WebElement> objList = driver.findElements(table);
	    for (WebElement objCurrentList : objList) {
	    	String strListText = objCurrentList.getText();
	    	String newline = System.getProperty("line.separator");
	    	System.out.println(strListText + newline);
		}*/
	    driver.close();
	}
}
