package common;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import java.util.Date;

public class browsers {
public static WebDriver driver; //interface

  @BeforeClass
	  @org.testng.annotations.Parameters({"url","browser"})
	  public void beforeClass(String wbsite, String br) {
		  if(br.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex & Maryna\\eclipse-workspace\\websites\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();   
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	  }else if(br.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alex & Maryna\\eclipse-workspace\\websites\\drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	  }else {
		  System.out.println("Please check name"); }}

  @AfterClass
  public void closeBrowser() {
          driver.quit();
  }
  public void screenshots(String source) throws IOException {
		     //method with argument String source so you can pass string data when call this method later
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(shots,new File(source +timestamp()+"screenshot.png"));
			}
public String timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}
