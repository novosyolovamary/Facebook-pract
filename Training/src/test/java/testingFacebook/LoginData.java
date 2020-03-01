package testingFacebook;

import org.testng.annotations.Test;

import com.Facebook.Pages.HomeFB;

import common.browsers;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class LoginData extends browsers{
  @Test(dataProvider = "dp")
  public void f(String e, String p) throws InterruptedException {
	  HomeFB fblog = new HomeFB (driver);
	  fblog.EnterEmail(e);
	  fblog.EnterPass(p);
	  fblog.HereYouGo();
	  driver.navigate().back();
	  fblog.clrEmail();
	  fblog.clrPass();
	  Thread.sleep(5000);
	  Reporter.log("Executed successfully");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "melanie@gmail.com", "bubu" },
      new Object[] { "3@gmail.com", "bebe" },
      new Object[] { " @yahoo.com", " " }
    };
  }
}
