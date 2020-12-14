package uiTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectDropDown {
  //WebDriver driver = null;

  @BeforeClass
  public void intiateDriver() {
    System.setProperty("webdriver.chrome.driver", "/Personal/CrackCode/TechSDE/crackcode/src/test/resources/chromedriver_mac64-83");
    //driver = new ChromeDriver();
  }

  @Test
  public void testDropDown() throws Exception {
    /*driver.get("https://demoqa.com/select-menu");
    driver.manage().window().maximize();*/
    Thread.sleep(6000);

  }
}
