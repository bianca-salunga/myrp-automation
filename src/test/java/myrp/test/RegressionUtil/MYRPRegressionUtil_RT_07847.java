package myrp.test.RegressionUtil;

import static org.openqa.selenium.By.xpath;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import myrp.library.MYRPObjectReferenceRT_07810;
import myrp.library.MYRPObjectReferenceRT_07847;
import myrp.library.FunctionReference;
import myrp.library.MYRPObjectReferenceRT_07862;
import myrp.library.ObjectReference;
import myrp.library.RegressionObjectReference;
import myrp.library.TestInitReference;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.GoBack;
import org.testng.Assert;

import sun.java2d.BackBufferCapsProvider;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import atu.testng.reports.ATUReports;

public class MYRPRegressionUtil_RT_07847 extends FunctionReference {

	private String[] input = null;
	private String testCase = "";
	String value = null;
	//private String url = "";
	//public String url = rxml.data(environment + "_url");
	
	public MYRPRegressionUtil_RT_07847(String[] i) {
		input = i;

	}

	public boolean gotoPVG_CBA() throws Exception {
		boolean success = false;
		
		System.out
				.println("========Preparing to navigate the page to PVG - CBA");
		
		driver.get(TestInitReference.url + "n/myrp-384");
			log("PVG - CBA");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg_slas));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg_slas)));
			sendKeys(xpath(MYRPObjectReferenceRT_07847.pvg_slas), input[5]);
	
			//Insert Code in the recaptcha
			Thread.sleep(2000);
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg_recaptcha));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg_recaptcha)));
			sendKeys(xpath(MYRPObjectReferenceRT_07847.pvg_recpatchText), value);
			
			Thread.sleep(15000);
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg_submitButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg_submitButton)));
			click(xpath(MYRPObjectReferenceRT_07847.pvg_submitButton));
			
			//Thread.sleep(2000);
			if (isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg_cbaLandingLogo))) {
				success = true;
				log("Succesfully Visit PVG - CBA");
				Thread.sleep(2000);
			} else {
				fail("Unable to Visit PVG - CBA");
			}
		} catch (AssertionError e) {
			fail("Unable to navigate the page to PVG - CBA");
		}
		
		//Purchase Button
			try {
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgPurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgPurchaseButton)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgPurchaseButton));
				Thread.sleep(3000);
				log("Download FSPR Successful");
			}catch (AssertionError e) {
				fail("Unable to check Download Free Suburb Profile Report Button");
			}
				
		System.out.println("========Preparing to check elements of the Property Value Guide Page");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHeaderTitle));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHeaderTitle)));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgResult));
			Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvgResult)));
			String text = getText(xpath(MYRPObjectReferenceRT_07847.pvgResult));
			Thread.sleep(1000);
			if (text.equalsIgnoreCase(input[6])) {
				success = true;
				log("Succesfully check Suburb Profile section");
				Thread.sleep(1000);
			} else {
				fail("Unable to check Suburb Profile Section");
			}
			log("Successfully check elements in PVG - CBA");
		}catch (AssertionError e) {
			fail("Unable to check elements in PVG - CBA");
		}
		

		System.out.println("========Preparing to check Area Statistics");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgAreaStatistics));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgAreaStatistics)));
					
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgAgeToSexRatioTab));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgAgeToSexRatioTab)));
			click(xpath(MYRPObjectReferenceRT_07847.pvgAgeToSexRatioTab));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgAgeToSexRatioImage));
			Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvgAgeToSexRatioImage)));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgIncomeTab));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgIncomeTab)));
			click(xpath(MYRPObjectReferenceRT_07847.pvgIncomeTab));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgIncomeImage));
			Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvgIncomeImage)));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgStructureTab));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgStructureTab)));
			click(xpath(MYRPObjectReferenceRT_07847.pvgStructureTab));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgStructureImage));
			Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvgStructureImage)));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgOccupancyTab));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgOccupancyTab)));
			click(xpath(MYRPObjectReferenceRT_07847.pvgOccupancyTab));
			Thread.sleep(1000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgOccupancyImage));
			Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvgOccupancyImage)));
			Thread.sleep(1000);
			
			log("Successfully check Area Statistics");
		}catch (AssertionError e) {
			fail("Unable to check Area Statistics");
		}
		
		System.out.println("========Preparing to check Market Statistics");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgMarketStatistics));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgMarketStatistics)));
			
			try{
				//12 Months Tab
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg12monthsTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg12monthsTab)));
				click(xpath(MYRPObjectReferenceRT_07847.pvg12monthsTab));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseLabel)));
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg12monthsHouseImage));
				Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg12monthsHouseImage)));
				Thread.sleep(1000);
							
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsLabel)));
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg12monthsUnitsImage));
				Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg12monthsUnitsImage)));
				log("Successfully check 12 Months Tab");
			}catch (AssertionError e) {
				fail("Unable to check 12 Months tab");
			}
			
			try {
				//3 Years Tab
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg3yearsTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg3yearsTab)));
				click(xpath(MYRPObjectReferenceRT_07847.pvg3yearsTab));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseLabel)));
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg3yearsHouseImage));
				Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg3yearsHouseImage)));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsLabel)));
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg3yearsUnitsImage));
				Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg3yearsUnitsImage)));
				log("Successfully check 3 Years Tab");
			}catch (AssertionError e) {
				fail("Unable to check 3 Years Tab");
			}
			
			try {
				//10 years Tab
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg10yearsTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg10yearsTab)));
				click(xpath(MYRPObjectReferenceRT_07847.pvg10yearsTab));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseLabel)));
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgHouseCb));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg10yearsHouseImage));
				Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg10yearsHouseImage)));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsLabel)));
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb)));
				click(xpath(MYRPObjectReferenceRT_07847.pvgUnitsCb));
				Thread.sleep(1000);
				
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07847.pvg10yearsUnitsImage));
				Assert.assertTrue(isElementVisible(xpath(MYRPObjectReferenceRT_07847.pvg10yearsUnitsImage)));
				Thread.sleep(2000);
				log("Successfully check 10 Years Tab");
			}catch (AssertionError e) {
				fail("Unable to check 10 Years Tab");
			}
	
			log("Successfully check Market Statistics");
		}catch (AssertionError e) {
			fail("Unable to check Market Statistics");
		}
	
		Thread.sleep(2000);
		return success;
	}
		
}