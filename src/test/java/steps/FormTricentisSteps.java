package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import objects.Driver;


public class FormTricentisSteps {
	
	WebDriver driver = new Driver().setup();
	WebDriverWait wait;
    
    @Before
    public void setup() {
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10l);
    }
	
	@Dado("que o usuário está na página de cadastro do site {string}")
	public void que_o_usuário_está_na_página_de_cadastro_do_site(String site) {
		driver.get(site);
	}

	@Quando("preenche os dados do formulário")
	public void preenche_os_dados_do_formulário() {
		//make select
	    Select make = new Select(driver.findElement(By.id("make")));
	    make.selectByValue("BMW");
	    
	    //model select
	    Select model = new Select(driver.findElement(By.id("model")));
	    model.selectByValue("Scooter");
	    
	    //cylinder input
	    driver.findElement(By.id("cylindercapacity")).sendKeys("70");
	    
	    //engine input
	    driver.findElement(By.id("engineperformance")).sendKeys("15");
	    
	    //date input
	    driver.findElement(By.id("dateofmanufacture")).sendKeys("10/31/1999");
	    
	    //seats select
	    Select numberOfSeats = new Select(driver.findElement(By.id("numberofseats")));
	    numberOfSeats.selectByValue("2");

	    //right hand input
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span")).click();
	    
	    //number of seats motorcycle select
	    Select numberSeats = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
	    numberSeats.selectByValue("2");
	    
	    //fuel select
	    Select fuel = new Select(driver.findElement(By.id("fuel")));
	    fuel.selectByValue("Electric Power");
	    
	    //payload input
	    driver.findElement(By.id("payload")).sendKeys("250");
	    
	    //totalweight input
	    driver.findElement(By.id("totalweight")).sendKeys("750");

	    //listprice input
	    driver.findElement(By.id("listprice")).sendKeys("100000");
	    
	    //licenseplatenumber input
	    driver.findElement(By.id("licenseplatenumber")).sendKeys("ABCD123");

	    //annualmileage input
	    driver.findElement(By.id("annualmileage")).sendKeys("200");
	}
	
	@Quando("clica em next para a aba Insurant Data")
	public void clica_em_next_para_a_aba_insurant_data() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	@Então("deve preencher o formulário Insurant Data")
	public void deve_preencher_o_formulário_insurant_data() {
		//firstname input
		driver.findElement(By.id("firstname")).sendKeys("Bruna");
				
		//lastname input
		driver.findElement(By.id("lastname")).sendKeys("Prado");
				
		//birthdate input
		driver.findElement(By.id("birthdate")).sendKeys("10/31/1994");
				
		//gender input
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span")).click();
				
		//streetaddress input
		driver.findElement(By.id("streetaddress")).sendKeys("Rua Qualquer Coisa");
				
		//country select
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByValue("Brazil");
			    
		//zipcode input
		driver.findElement(By.id("zipcode")).sendKeys("13991222");
			    
		//city input
		driver.findElement(By.id("city")).sendKeys("Jaguariuna");
			    
		//occupation select
		Select occupation = new Select(driver.findElement(By.id("occupation")));
		occupation.selectByValue("Farmer");
			    
		//hobbies input
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]/span")).click();
			    
		//website input
		driver.findElement(By.id("website")).sendKeys("https://www.linkedin.com/in/bruna-prado-/");
			    
			    
	}

	@Então("clica em next para a aba Product Data")
	public void clica_em_next_para_a_aba_product_data() {
		//nextenterproductdata
	    driver.findElement(By.id("nextenterproductdata")).click();
	}

	@Então("deve preencher o formulário Product Data")
	public void deve_preencher_o_formulário_product_data() {
		//startdate input
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input")).sendKeys("10/05/2021");
				
		//insurancesum select
		Select insurancesum = new Select(driver.findElement(By.id("insurancesum")));
		insurancesum.selectByValue("15000000");
				
		//meritrating select
		Select meritrating = new Select(driver.findElement(By.id("meritrating")));
		meritrating.selectByValue("Bonus 9");
				
		//damageinsurance select
		Select damageinsurance = new Select(driver.findElement(By.id("damageinsurance")));
		damageinsurance.selectByValue("No Coverage");
				
		//optional products input
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span")).click();
				
		//courtesycar select
		Select courtesycar = new Select(driver.findElement(By.id("courtesycar")));
		courtesycar.selectByValue("Yes");
	}

	@Então("clica em next para a aba Select Price Option")
	public void clica_em_next_para_a_aba_select_price_option() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}

	@Então("deve preencher o formulário Select Price Option")
	public void deve_preencher_o_formulário_select_price_option() {
		//select price option		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span")).click();	
	}

	@Então("clica em next para a aba Send Quote")
	public void clica_em_next_para_a_aba_send_quote() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextsendquote")));
		
		//next button
		driver.findElement(By.id("nextsendquote")).click();
	}

	@Então("deve preencher o formulário Send Quote")
	public void deve_preencher_o_formulário_send_quote() {
		//email input
		driver.findElement(By.id("email")).sendKeys("bru.prado123@gmail.com");
				
		//phone input
		driver.findElement(By.id("phone")).sendKeys("19999999999");
				
		//username input
		driver.findElement(By.id("username")).sendKeys("bruprado");
				
		//password input
		driver.findElement(By.id("password")).sendKeys("TesteSenha55478");
				
		//confirmpassword input
		driver.findElement(By.id("confirmpassword")).sendKeys("TesteSenha55478");
				
		//Comments text area
		driver.findElement(By.id("Comments")).sendKeys("Deu tudo certo!");
	}
	
	@Quando("clica em send")
	public void clica_em_send() {
		//sendemail button
		driver.findElement(By.id("sendemail")).click();
	}
	
	@Então("deve verificar a mensagem {string}")
	public void deve_verificar_a_mensagem(String message) {
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        
        String messageConfirmed = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(message, messageConfirmed);
        
        driver.findElement(By.xpath("html/body/div[4]/div[7]/div/button")).click();
	}
	
	@After
	public void dps() {
		driver.quit();
	}
	
}
