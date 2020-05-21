package steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdicionarProdutoSteps {
	
	private WebDriver driver;
	
	@Given("que estou acessando a aplicacao")
	public void que_estou_acessando_a_aplicacao() {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.americanas.com.br/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("informo o produto")
	public void informo_o_produto_produto() {
	    driver.findElement(By.id("h_search-input")).sendKeys("geladeira");
	}

	@When("seleciono pesquisar")
	public void seleciono_pesquisar() {
	    driver.findElement(By.id("h_search-btn")).click();
	    WebElement text = driver.findElement(By.xpath("//h1[@class='h1 page-title']"));
	    Assert.assertEquals("geladeira", text.getText());
	}

	@When("escolho o item")
	public void escolho_o_item() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//div[@class='row product-grid no-gutters main-grid']"
				+ "//div[1]//div[1]//div[2]//a[1]//section[1]//div[2]//div[1]//h2[1]")).click();
	}

	@When("adiciono no carrinho")
	public void adiciono_no_carrinho() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]"
				+ "/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/a[1]")).click();
	}

	@Then("Vizualizo o produto adicionado")
	public void vizualizo_o_produto_adicionado() {
		driver.findElement(By.id("btn-continue")).click();
	   WebElement text = driver.findElement(By.xpath("//h2[@class='page-title col-xs-7']"));
	   Assert.assertEquals("minha cesta", text.getText());
	   
	}
	@Before
	public void inicio() {
		System.out.println("Iniciando...");
	}
	@After(order = 0)
	public void screenshot() throws Exception {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("target/screenshot.png"));
		driver.close();
	}
	

}
