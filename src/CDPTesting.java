import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.emulation.Emulation;

public class CDPTesting {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankit.kumar39\\Desktop\\Udemy\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    DevTools devtool=driver.getDevTools();
    devtool.createSession();
    devtool.send(Emulation.setDeviceMetricsOverride(400, 472, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
    driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.9.0");
    //driver.findElement(By.cssSelector(null)).click();
    System.out.println(" CDPTesting done by TesterX");
    System.out.println(" CDPTesting done by TesterY");
    System.out.println(" CDPTesting done by TesterY");
    
  //Comment By TesterY
    //Branching by Tester X
    //Branching BY XY
	}
	

}
