package basePages;

import baseTestFiles.PreTestFile;

public class PreTestPage extends PreTestFile{
	TestFoundation testfoundation;
	
	public void fetchEnvironmentURL() {
		testfoundation = new TestFoundation();
		String url = testfoundation.fetchDataFromPropertyFile("config.properties", "url");
		System.out.println(url);
		driver.navigate().to(url);
	}

	public String fetchExecutionData(String file, String field) {
		testfoundation = new TestFoundation();
		String data = testfoundation.fetchDataFromPropertyFile(file, field);
		System.out.println(data);
		return data;
	}

}
