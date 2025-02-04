package package_alert_handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set path to Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\HKAselenium_Alert_Handling\\filess\\chromedriver.exe");
		
		//Initialize the chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		try {
			//open the demo alert page
			driver.get("https://demoqa.com/alerts");
			
			//handle simple alert
			WebElement simpleAlertButton = driver.findElement(By.id("alertButton")); 
		    simpleAlertButton.click();
		    Alert simpleAlert = driver.switchTo().alert();
		    System.out.println("Simple Alert Message:" + simpleAlert.getText());
		    simpleAlert.accept();
		    
		    //Handle Confirmation Alert
		    WebElement confirmButton = driver.findElement(By.id("confirmButton"));
		    confirmButton.click();
		    Alert confirmAlert = driver.switchTo().alert();
		    System.out.println("Confirmation of Alert: " + confirmAlert.getText());
		    confirmAlert.dismiss(); //click cancel
		    
		    //Handle Prompt Alert	    
		    WebElement prompButton = driver.findElement(By.id("promtButton"));
		    prompButton.click();
		    Alert prompAlert = driver.switchTo().alert();
		    System.out.println("Promp Alert Message: " + prompAlert.getText());
		    prompAlert.sendKeys("Himpreet Kaur"); //Input text in prompt
		    prompAlert.accept();
		    
		    //Pause for demonstration
		    Thread.sleep(3000);
		}
		    
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
		    finally {
		    	//Close the browser
		    	driver.quit();
		    }  
	}
}
