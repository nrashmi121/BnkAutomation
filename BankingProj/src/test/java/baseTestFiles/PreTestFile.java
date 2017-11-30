package baseTestFiles;

import org.testng.annotations.BeforeSuite;

import basePages.PreTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;

public class PreTestFile {
	public static WebDriver driver;
	PreTestPage pretestpage;
	
	@BeforeSuite
	public void beforeSuite() {
		pretestpage = new PreTestPage();
		String browser = pretestpage.fetchExecutionData("codeExecuter.properties", "browser");
		System.out.println("==============>" + browser);
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Correct browser is not specified.");
			break;
		}
//		driver.manage().window().maximize();
		pretestpage.fetchEnvironmentURL();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
