package testFiles;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basePages.TestFoundation;
import baseTestFiles.PreTestFile;
import helperPages.SignInPage;

import org.testng.annotations.BeforeTest;

public class SignInTest extends PreTestFile {
	TestFoundation tf = new TestFoundation();
	SignInPage signinpage = new SignInPage();
	
	@Test
    public void signIntoAccount() {
	  String uid = tf.fetchDataFromPropertyFile("config.properties", "UserName");
	  System.out.println(uid);
	  String psw = tf.fetchDataFromPropertyFile("config.properties", "Password");
	  System.out.println(psw);
	  
	  signinpage.signIntoBankingAccount(uid, psw);
    }

	@BeforeTest
	public void beforeTest() {
	}

}
