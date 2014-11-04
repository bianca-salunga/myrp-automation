package myrp.test.RegressionUtil;

import static org.openqa.selenium.By.xpath;

import java.io.IOException;
import java.util.List;

import myrp.library.MYRPObjectReferenceRT_07810;
import myrp.library.FunctionReference;
import myrp.library.MYRPObjectReferenceRT_07862;
import myrp.library.ObjectReference;
import myrp.library.RegressionObjectReference;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.GoBack;
import org.testng.Assert;

import sun.java2d.BackBufferCapsProvider;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import atu.testng.reports.ATUReports;

public class MYRPRegressionUtil_RT_07862 extends FunctionReference {

	private String[] input = null;
	private String testCase = "";

	// String winHandleBefore = "";

	public MYRPRegressionUtil_RT_07862(String[] i) {
		input = i;

	}

	public boolean gotoCopyrightDisclaimerNotices(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Copyright & Disclaimer Notices Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.copyrightAndDisclaimerNoticesLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.copyrightAndDisclaimerNoticesLink)));
			click(xpath(MYRPObjectReferenceRT_07862.copyrightAndDisclaimerNoticesLink));
	
			goToNextBrowserTab();
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.disclaimerNextBrowser));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.disclaimerNextBrowser)));
			String text = getText(xpath(MYRPObjectReferenceRT_07862.disclaimerNextBrowser));

			if (text.equalsIgnoreCase("Disclaimer")) {
				success = true;
				log("Succesfully Visit the Copyright & Disclaimer Notices Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the Copyright & Disclaimer Notices Link");
			}
			if(goToPreviousBrowserTab){
				goToPreviousBrowserTab(testCase);
				}
		} catch (AssertionError e) {
			fail("Unable to navigate to the Copyright & Disclaimer Notices Link");
		}
		return success;
	}
	
	public boolean gotoTermsAndConditions(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Terms & Conditions Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.termsAndconditionsLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.termsAndconditionsLink)));
			click(xpath(MYRPObjectReferenceRT_07862.termsAndconditionsLink));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://www.rpdata.com/terms.html")){
				success = true;
				log("Succesfully Visit the Terms & Conditions Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the Terms & Conditions Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the Terms & Conditions Link");
		}

		return success;
	}
	
	public boolean gotoPrivacyPolicy(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Privacy Policy Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.privacyPolicyLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.privacyPolicyLink)));
			click(xpath(MYRPObjectReferenceRT_07862.privacyPolicyLink));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.privacyPolicyNextBrowser));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.privacyPolicyNextBrowser)));
			String text = getText(xpath(MYRPObjectReferenceRT_07862.privacyPolicyNextBrowser));

			if (text.equalsIgnoreCase("Privacy Policy")) {
				success = true;
				log("Succesfully Visit the Privacy Policy Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the Privacy Policy Link");
			}
			if(goToPreviousBrowserTab){
				goToPreviousBrowserTab(testCase);
				}
		} catch (AssertionError e) {
			fail("Unable to navigate to the Privacy Policy Link");
		}
		
		return success;
	}
	
	public boolean gotoMyRPData() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the My RPData Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.MyRPDataLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.MyRPDataLink)));
			click(xpath(MYRPObjectReferenceRT_07862.MyRPDataLink));
			Thread.sleep(2000);
			
			String url = driver.getCurrentUrl();
			
			if(url.equalsIgnoreCase("http://www.myrp.com.au/")){
				success = true;
				log("Succesfully Visit the My RPData Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the My RPData Link");
			}
			
			driver.navigate().back();
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.MyRPDataLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.MyRPDataLink)));
			
		} catch (AssertionError e) {
			fail("Unable to navigate to the My RPData Link");
		}

		return success;
	}
	
	public boolean gotoRPData(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the RPData Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.RPDataLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.RPDataLink)));
			click(xpath(MYRPObjectReferenceRT_07862.RPDataLink));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://www.rpdata.com/")){
				success = true;
				log("Succesfully Visit the RPData Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the RPData Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the RPData Link");
		}

		return success;
	}
	
	public boolean gotoNZReports(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the NZ Reports Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.NZReportsLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.NZReportsLink)));
			click(xpath(MYRPObjectReferenceRT_07862.NZReportsLink));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://www.qv.co.nz/")){
				success = true;
				log("Succesfully Visit the NZ Reports Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the NZ Reports Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the NZ Reports Link");
		}

		return success;
	}
	
	public boolean gotoUSAReports(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the USA Reports Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.USAReportsLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.USAReportsLink)));
			click(xpath(MYRPObjectReferenceRT_07862.USAReportsLink));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://www.realquest.com/jsp/rq.jsp?action=switch&page=main")){
				success = true;
				log("Succesfully Visit the USA Reports Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the USA Reports Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the USA Reports Link");
		}

		return success;
	}
	
	public boolean gotoChinaInfo(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the China Info Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.ChinaInfoLinks));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.ChinaInfoLinks)));
			click(xpath(MYRPObjectReferenceRT_07862.ChinaInfoLinks));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://fdc.fang.com/")){
				success = true;
				log("Succesfully Visit the China Info Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the China Info Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the China Info Link");
		}

		return success;
	}
	
	public boolean gotoFacebookLink(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Facebook Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.facebookLinks));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.facebookLinks)));
			click(xpath(MYRPObjectReferenceRT_07862.facebookLinks));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("https://www.facebook.com/rpdata")){
				success = true;
				log("Succesfully Visit the Facebook Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the Facebook Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the Facebook Link");
		}

		return success;
	}
	
	public boolean gotoTwitterLink(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Twitter Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.twitterLinks));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.twitterLinks)));
			click(xpath(MYRPObjectReferenceRT_07862.twitterLinks));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("https://twitter.com/rpdata")){
				success = true;
				log("Succesfully Visit the Twitter Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the Twitter Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the Twitter Link");
		}

		return success;
	}
	
	public boolean gotoYouTubeLink(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the YouTube Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.youTubeLinks));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.youTubeLinks)));
			click(xpath(MYRPObjectReferenceRT_07862.youTubeLinks));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://www.youtube.com/user/RPDataVideos")){
				success = true;
				log("Succesfully Visit the YouTube Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the YouTube Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the YouTube Link");
		}

		return success;
	}
	
	public boolean gotoBlogLink(boolean goToPreviousBrowserTab) throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Blog Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07862.blogLinks));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07862.blogLinks)));
			click(xpath(MYRPObjectReferenceRT_07862.blogLinks));
			
			goToNextBrowserTab();
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.equalsIgnoreCase("http://blog.myrp.com.au/")){
				success = true;
				log("Succesfully Visit the Blog Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate the Blog Link");
			}
			if(goToPreviousBrowserTab){
			goToPreviousBrowserTab(testCase);
			}
		} catch (AssertionError e) {
			fail("Unable to navigate to the Blog Link");
		}

		return success;
	}
}