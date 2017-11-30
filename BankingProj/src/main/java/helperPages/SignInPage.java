package helperPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import baseTestFiles.PreTestFile;

public class SignInPage extends PreTestFile{
	
	//Web Elements
	By uid = By.xpath("//table/tbody/tr[1]/td/input");
	By passwd = By.xpath("//table/tbody/tr[2]/td/input");
	By loginBtn = By.name("btnLogin");
	By reset = By.name("btnReset");
	public SignInPage() {
		// TODO Auto-generated constructor stub
	}

	public void signIntoBankingAccount(String usrid, String psw){
		System.out.println(usrid + " --------------- " + psw);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Signing in to the application .. Wait!!!");
		driver.findElement(uid).sendKeys(usrid);
		driver.findElement(passwd).sendKeys(psw);
		driver.findElement(loginBtn).click();
	}
}
