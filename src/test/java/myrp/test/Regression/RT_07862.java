package myrp.test.Regression;

import java.io.IOException;

import myrp.library.ReadXlsData;
import myrp.library.TestInitReference;
import myrp.test.RegressionUtil.MYRPRegressionUtil_RT_07862;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sun.java2d.BackBufferCapsProvider;
import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.utils.Utils;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
MethodListener.class })
public class RT_07862 extends TestInitReference {
	{
		System.setProperty("atu.reporter.config", "../myrp-automation/conf/atu.properties");
	}
	
	String testCase = "RT_07862";
		
	@Test(description="RT_07862", dataProvider = "Data-Provider-Function")
	public void RT_07862(Class clzz, String[] input) {
		String testcase = "Testing Testcase - " + input[0] + " : " + input[2];
		int x = 1;
		try {
			MYRPRegressionUtil_RT_07862 rp = new MYRPRegressionUtil_RT_07862(input);
			
			if(rp.gotoCopyrightDisclaimerNotices(true)
					&& rp.gotoTermsAndConditions(true)
					&& rp.gotoPrivacyPolicy(true)
					&& rp.gotoMyRPData()
					&& rp.gotoRPData(true)
					&& rp.gotoNZReports(true)
					&& rp.gotoUSAReports(true)
					&& rp.gotoChinaInfo(true)
					&& rp.gotoFacebookLink(true)
					&& rp.gotoTwitterLink(true)
					&& rp.gotoYouTubeLink(true)
					&& rp.gotoBlogLink(true)){
				ATUReports.add(input[1],"LANDING PAGE",input[2], input[3], true);//pass
			}else{
				ATUReports.add(input[1],"LANDING PAGE",input[2], input[4], true);//fail
			}
			
		}catch (Exception e) {
			fail(testcase);
			e.printStackTrace();
	        Assert.fail("Exception was thrown");
		}
	}

	//This function will provide the parameter data
	@DataProvider(name = "Data-Provider-Function")
	public Object[][] parameterIntTestProvider() throws IOException{
		Object[][] data = null;
		ReadXlsData rxd = new ReadXlsData("../myrp-automation/test-data/RT_07862.xls");
		data = rxd.getData();
		return data;
	}
	
    @AfterMethod
    public void reinitializeBrowser() throws InterruptedException, IOException {
    	driver.manage().deleteAllCookies();
    	driver.get(url);
    }

    @BeforeClass
    public void init() {
           ATUReports.setWebDriver(driver);
           setIndexPageDescription();
    }
    
    private void setIndexPageDescription() {
        ATUReports.indexPageDescription = "MYRP";
        ATUReports.setAuthorInfo("Automation Tester", Utils.getCurrentTime(),"1.0");
    }

}
