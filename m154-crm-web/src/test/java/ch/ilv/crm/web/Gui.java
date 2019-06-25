package ch.ilv.crm.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gui {

/*
private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void addProduct() throws InterruptedException {				
        //Launch the Online Store Website
		driver.get("http://localhost:7070/");
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));
		driver.get("http://localhost:7070/products");

		
		WebElement productField = driver.findElement(By.xpath("/html/body/form[1]/input"));
		productField.sendKeys("Trees");

		WebElement saveBtn = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
		saveBtn.click();
		
		Thread.sleep(5000);
		
		WebElement useridField = driver.findElement(By.xpath("/html/body/span"));
		System.out.println(useridField.getText());
		assertTrue(useridField.getText().trim().contains("Trees saved"));
	}
	
	@Test
	public void searchUser() throws InterruptedException {
        //Launch the Online Store Website
		driver.get("http://localhost:7070/");
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));
		driver.get("http://localhost:7070/products");

		
		WebElement productField = driver.findElement(By.xpath("/html/body/form[1]/input"));
		productField.sendKeys("Trees");

		WebElement saveBtn = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
		saveBtn.click();
		
		Thread.sleep(5000);
		
		WebElement useridField = driver.findElement(By.xpath("/html/body/span"));
		String id = useridField.getText().trim();
		id = id.substring(8,id.length()-14);
		
		WebElement searchField = driver.findElement(By.xpath("/html/body/form[2]/input"));
		searchField.sendKeys(id);
		
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/form[2]/p/input"));
		searchBtn.click();
		
		WebElement descriptionField = driver.findElement(By.xpath("/html/body/span[2]"));
		
		assertTrue(descriptionField.getText().trim().contains("Trees"));
	}
*/

}
