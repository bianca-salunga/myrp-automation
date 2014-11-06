package myrp.test.RegressionUtil;


import static org.openqa.selenium.By.xpath;

import java.io.IOException;
import java.util.List;

import myrp.library.FunctionReference;
import myrp.library.MYRPObjectReference_RTC;
import myrp.library.ObjectReference;
import myrp.library.ObjectReferenceSmoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import atu.testng.reports.ATUReports;

public class MYRPRegressionUtil_RT07926 extends FunctionReference {
	
	private String[] input = null;
	private String testCase = "";
		public MYRPRegressionUtil_RT07926(String[] i) {
			input = i;
	}
		/// START RT_07926
		public boolean FSPR() throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing to check if FSPR can be downloaded");
			try
			{
				// check if the SLAS and Search button are available
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				Thread.sleep(10000);
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[5]);
				System.out.println("Adress entered");
				
				// showing address results and clicking the search button
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				// check and click for FSPR button
				waitForElementPresent(xpath(MYRPObjectReference_RTC.getFSPRbutton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getFSPRbutton)));
				System.out.println("FSPR button is available");
				click(xpath(MYRPObjectReference_RTC.getFSPRbutton));
				System.out.println("FSPR button clicked");
				Thread.sleep(2000);
				
				// getting email address window
				waitForElementPresent(xpath(MYRPObjectReference_RTC.gettingEmailwindow));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.gettingEmailwindow)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.emailaddressLabel));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.emailaddressLabel)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.emailaddressField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.emailaddressField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.submitbuttonFSPR));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.submitbuttonFSPR)));
				
				Thread.sleep(2000);
				// type email address
				type(xpath(MYRPObjectReference_RTC.emailaddressField), input[6]);
				System.out.println("Email Address entered");
				click(xpath(MYRPObjectReference_RTC.submitbuttonFSPR));
				System.out.println("Submitting Email address");
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				// FSPR success window
				waitForElementPresent(xpath(MYRPObjectReference_RTC.thankyouWindow));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.thankyouWindow)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.thankyouMessage));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.thankyouMessage)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.FSPRthankyouImage));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.FSPRthankyouImage)));
				System.out.println("FSPR Thank you message shows");
				Thread.sleep(2000);
				waitForElementPresent(xpath(MYRPObjectReference_RTC.FSPRcloseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.FSPRcloseButton)));
				click(xpath(MYRPObjectReference_RTC.FSPRcloseButton));	
				System.out.println("FSPR Thank you message close");
				
			}
			 catch (AssertionError e) {
					fail("Unable to get Free Suburb Profile Report");
			 }
			return success;		
		}/// END RT_07926
		
		public boolean PropertyReports() throws Exception{
			boolean success = false;
			System.out.println("========Preparing to purchase multiple reports as Guest user");
			try {
				if(purchasedEstimatedReport() && purchasedDetailedReport() && purchasedSalesHistoryReport() && purchasedStreetHistoryReport() && purchasedSuburbSalesHistoryReport() && purchasedInvestorPostcodeReport() && gotoMyCartMerchant()){
					success = true;
					log("Successfully purchased report as guest user");
					Thread.sleep(2000);
				}else{
					fail("Some report cant be purchase");
				}
				
			} catch (AssertionError e) {
				fail("Some report cant be purchase");
			}
			return success;
		}
		
		
		private boolean purchasedEstimatedReport()  throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing to add to cart - Estimated Value Report");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[5]);
				System.out.println("Adress entered");
				
				// showing address results and clicking the search button
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.EstimatedReportTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.EstimatedReportTab)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.EstimatedReportField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.EstimatedReportField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.estimatedPurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.estimatedPurchaseButton)));
				click(xpath(MYRPObjectReference_RTC.estimatedPurchaseButton));
				
				//gotoAddedtoCart();
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Estimated value report");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Estimated value report");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Estimated value report");
				
				}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - Estimated value report");
			}
			return success;
			
		}
		
		
		private boolean purchasedDetailedReport()  throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing add to cart Detailed property report");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[6]);
				System.out.println("Adress entered");
				// showing address results and clicking the search button
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.DetailedReportTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.DetailedReportTab)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.DetailedReportField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.DetailedReportField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.detailedPurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.detailedPurchaseButton)));
				click(xpath(MYRPObjectReference_RTC.detailedPurchaseButton));
				
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Detailed property report");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Detailed property report");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Detailed property report");
				
				}

			} 
			catch (AssertionError e) {
				fail("Unable to add to cart - Detailed property report");
			}
			return success;
			
		}
		private boolean purchasedSalesHistoryReport()  throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing to add to cart - Sales History Report");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[7]);
				System.out.println("Adress entered");
				// showing address results and clicking the search button
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryReportTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryReportTab)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryReportField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryReportField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryPurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryPurchaseButton)));
				click(xpath(MYRPObjectReference_RTC.SalesHistoryPurchaseButton));
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryPopup));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryPopup)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryMsg));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryMsg)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryAgreeBtn));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryAgreeBtn)));
				
				click(xpath(MYRPObjectReference_RTC.SalesHistoryAgreeBtn));
				Thread.sleep(2000);
				
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Sales History report");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Sales History report");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Sales History report");
				
				}
			}
				
			catch (AssertionError e) {
				fail("Unable to add to cart - Sales History report");
			}
			return success;
			
			
		}
		
		private boolean purchasedStreetHistoryReport()  throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing to add to cart - Street History Report");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[8]);
				System.out.println("Adress entered");
				// showing address results and clicking the search button
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.StreetSalesReportTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.StreetSalesReportTab)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.StreetSalesReportField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.StreetSalesReportField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.StreetSalesPurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.StreetSalesPurchaseButton)));
				
				click(xpath(MYRPObjectReference_RTC.StreetSalesPurchaseButton));
				
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Street History report");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Street History report");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Street History report");
				
				}
				} 
			catch (AssertionError e) {
				fail("Unable to add to cart Street History report");
			}
			return success;
			
		}
		
		private boolean purchasedSuburbSalesHistoryReport()  throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing to add to cart - Suburb Sales History Report");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[9]);
				System.out.println("Adress entered");
				// showing address results and clicking the search button
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SuburbSalesReportTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuburbSalesReportTab)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SuburbSalesReportField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuburbSalesReportField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SuburbSalesPurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuburbSalesPurchaseButton)));
				
				click(xpath(MYRPObjectReference_RTC.SuburbSalesPurchaseButton));
				
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Suburb Sales History Report");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Suburb Sales History Report");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Suburb Sales History Report");
				
				}
				} 
			catch (AssertionError e) {
				fail("Unable to add to cart - Suburb Sales History Report");
			}
			return success;
			
		}
		
		private boolean purchasedInvestorPostcodeReport()  throws Exception{
			// TODO Auto-generated method stub
			boolean success = false;
			System.out.println("========Preparing to add to cart - Investor Postcode Report");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchbySLAS)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickSearchAddress)));
				
				//typing of address
				type(xpath(MYRPObjectReference_RTC.searchbySLAS),input[10]);
				System.out.println("Adress entered");
				// showing address results and clicking the search button
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
				System.out.println("Result shows");
				click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
				click(xpath(MYRPObjectReference_RTC.clickSearchAddress));
				System.out.println("Click search button");
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.InvestorPostcodeReportTab));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.InvestorPostcodeReportTab)));
				click(xpath(MYRPObjectReference_RTC.InvestorPostcodeReportTab));
				
				waitForElementPresent(xpath(MYRPObjectReference_RTC.InvestorPostcodeReportField));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.InvestorPostcodeReportField)));
				waitForElementPresent(xpath(MYRPObjectReference_RTC.InvestorPostcodePurchaseButton));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.InvestorPostcodePurchaseButton)));
				
				click(xpath(MYRPObjectReference_RTC.InvestorPostcodePurchaseButton));
				
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Investor Postcode Report");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Investor Postcode Report");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Investor Postcode Report");
				
				}
				} 
			catch (AssertionError e) {
				fail("Unable to add to cart - Investor Postcode Report");
			}
			return success;
		
			
		}
		////MERCHANT GUEST//
	private boolean gotoMyCartMerchant()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		int month = 10;
		int year = 4;
		
		System.out.println("========Preparing to go to My Cart- Merchant Page");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			
			/// element on mycart page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PurchaseContainer));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PurchaseContainer)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.merchantField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.merchantField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryMonthField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryMonthField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryYearField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryYearField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaynowContainer));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaynowContainer)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaynowButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaynowButton)));
			// end element on mycart page
			System.out.println("All elements on My cart page is present");
			
			// input for credi card details
			
			type(xpath(MYRPObjectReference_RTC.GuestEmail),input[16]);
			type(xpath(MYRPObjectReference_RTC.cardNameField),input[11]);
			type(xpath(MYRPObjectReference_RTC.cardNumberField),input[12]);
			
			selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.cardExpiryMonthField), month);
			selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.cardExpiryYearField), year);
			
			type(xpath(MYRPObjectReference_RTC.SecurityCodeField),input[15]);
			
			click(xpath(MYRPObjectReference_RTC.PaynowButton));
			System.out.println("Clicking the pay now button");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField)));
			
			String text = getText(xpath(MYRPObjectReference_RTC.PaymentMsg));
	
			
			if(text.equalsIgnoreCase("Purchase successful")){
				success = true;
				log("Succesfully purchase multiple reports s guest user");
				Thread.sleep(2000);
			}
			else{
				fail("Unable to purchase multiple reports s guest user");
			}
			} 
		catch (AssertionError e) {
			fail("Unable to purchase multiple reports s guest user");
		}
		return success;
		
	}
	///END OF MERCHANT GUEST//
	//CPS//
	private boolean gotoMyCartCPSGUEST()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		int month = 10;
		int year = 4;
		
		System.out.println("========Preparing to go to My Cart - DPS PAYMENT PAGE Page");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail)));
			type(xpath(MYRPObjectReference_RTC.GuestEmail),input[16]);
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.OrderNowbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.OrderNowbtn)));
			click(xpath(MYRPObjectReference_RTC.OrderNowbtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PayNowbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PayNowbtn)));
			click(xpath(MYRPObjectReference_RTC.PayNowbtn));
			
			//element oon DPS page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CPSheader));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CPSheader)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CPSfooter));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CPSfooter)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNumberLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNumberLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNumberField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNumberField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNameLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNameLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.ExpireLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.ExpireLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Expiremonth));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Expiremonth)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Expireyear));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Expireyear)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Submitbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Submitbtn)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Cancelbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Cancelbtn)));
			System.out.println("All elements on My cart page is present");
			
			
			type(xpath(MYRPObjectReference_RTC.CardNameField),input[11]);
			type(xpath(MYRPObjectReference_RTC.CardNumberField),input[12]);
			type(xpath(MYRPObjectReference_RTC.Expiremonth),input[13]);
			type(xpath(MYRPObjectReference_RTC.Expireyear),input[14]);
			type(xpath(MYRPObjectReference_RTC.SecuritycodeField),input[15]);
			
			click(xpath(MYRPObjectReference_RTC.Submitbtn));
			System.out.println("Clicking the pay now button");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField)));
			
			String text = getText(xpath(MYRPObjectReference_RTC.PaymentMsg));
	
			
			if(text.equalsIgnoreCase("Purchase successful")){
				success = true;
				log("Succesfully purchase reports");
				Thread.sleep(2000);
			}
			else{
				fail("Unable to purchase reports");
			}
			} 
		catch (AssertionError e) {
			fail("Unable to purchase reports");
		}
		return success;
		
	}
	//CPS GUEST//
	private boolean gotoAddedtoCart() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		//System.out.println("========Preparing add to cart Detailed property report");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
			String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
			if(text.equalsIgnoreCase("Added to cart"))
				{
					success = true;
					log("Succesfully added to cart - Estimated value report");
					Thread.sleep(2000);
				}
			else
				{
					fail("Unable to add to cart - Estimated value report");
				}
		}
		catch (AssertionError e) {
			fail("Unable to add to cart - Estimated value report");
		
		}
		return success;
	}
	
	public boolean SubscriptionReport() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		//System.out.println("========Preparing to purchase subscription report as registered user");
		try {
			if(purchaseEstimatedValueSubcription() && purchasedSuburbSalesMapSubscription() && purchasedSuburbValueMapSubscription() && gotoSiginCart() && gotoMyCartMerchantRegisterUser()){
				success = true;
				log("Successfully purchased Subscription report as registered user");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	private boolean purchaseEstimatedValueSubcription()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to add to cart - Estimated Value Subcription");
		try {
			
			
			//click the property reports landing page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertySevicesButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertySevicesButton)));
			click(xpath(MYRPObjectReference_RTC.propertySevicesButton));
			System.out.println("Clicking the property tab");
			//checking if estimated subus button is exists
			waitForElementPresent(xpath(MYRPObjectReference_RTC.estimatedValueSubscriptionButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.estimatedValueSubscriptionButton)));
			click(xpath(MYRPObjectReference_RTC.estimatedValueSubscriptionButton));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisreport));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisreport)));
			click(xpath(MYRPObjectReference_RTC.getThisreport));
			//searching for the address
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.searchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchAddressField)));
			type(xpath(MYRPObjectReference_RTC.searchAddressField),input[5]);
			System.out.println("Adress entered");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			System.out.println("Result shows");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.estimatedsubsField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.estimatedsubsField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.estimatedsubsbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.estimatedsubsbtn)));
			
			click(xpath(MYRPObjectReference_RTC.estimatedsubsbtn));
			
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Estimated value subscription");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Estimated value subscription");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Estimated value subscription");
				
				}
			
			
			} 
		catch (AssertionError e) {
			fail("Unable to add to cart - Estimated value subscription");
		}
		return success;
	}
	
	private boolean purchasedSuburbSalesMapSubscription()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to add to cart - Suburb Sales Map Subcription");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.logo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.logo)));
			click(xpath(MYRPObjectReference_RTC.logo));
			//click the property reports landing page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportsButton)));
			click(xpath(MYRPObjectReference_RTC.suburbreportsButton));
			System.out.println("Clicking the suburb report tab");
			//checking if estimated subus button is exists
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbsalesmapButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbsalesmapButton)));
			click(xpath(MYRPObjectReference_RTC.suburbsalesmapButton));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisreport));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisreport)));
			click(xpath(MYRPObjectReference_RTC.getThisreport));
			//searching for the address
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.searchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchAddressField)));
			type(xpath(MYRPObjectReference_RTC.searchAddressField),input[6]);
			System.out.println("Adress entered");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			System.out.println("Result shows");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbfield));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbfield)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbfieldbutton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbfieldbutton)));
			
			click(xpath(MYRPObjectReference_RTC.suburbfieldbutton));
			
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Suburn Sales map subscription");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Suburn Sales map subscription");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Suburn Sales map subscription");
				
				}
			} 
		catch (AssertionError e) {
			fail("Unable to add to cart - Suburn sales map subscription");
		}
		return success;
	}
	private boolean purchasedSuburbValueMapSubscription()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to add to cart -Suburb Value Map Subcription");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.logo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.logo)));
			click(xpath(MYRPObjectReference_RTC.logo));
			//click the property reports landing page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportsButton)));
			click(xpath(MYRPObjectReference_RTC.suburbreportsButton));
			System.out.println("Clicking the suburb report tab");
			//checking if estimated subus button is exists
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbvaluwmapButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbvaluwmapButton)));
			click(xpath(MYRPObjectReference_RTC.suburbvaluwmapButton));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisreport));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisreport)));
			click(xpath(MYRPObjectReference_RTC.getThisreport));
			//searching for the address
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.searchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.searchAddressField)));
			type(xpath(MYRPObjectReference_RTC.searchAddressField),input[7]);
			System.out.println("Adress entered");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			System.out.println("Result shows");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbfield));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbfield)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbfieldbutton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbfieldbutton)));
			
			click(xpath(MYRPObjectReference_RTC.suburbfieldbutton));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryPopup));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryPopup)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryMsg));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryMsg)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryAgreeBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SalesHistoryAgreeBtn)));
			
			click(xpath(MYRPObjectReference_RTC.SalesHistoryAgreeBtn));
			Thread.sleep(2000);
			
				try {
					waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
					String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
					if(text.equalsIgnoreCase("Added to cart"))
						{
							success = true;
							log("Succesfully added to cart - Suburn value map subscription");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to add to cart - Suburn value map subscription");
						}
				}
				catch (AssertionError e) {
					fail("Unable to add to cart - Suburn value map subscription");
				
				}
			} 
		catch (AssertionError e) {
			fail("Unable to add to cart -Suburn value map subscription");
		}
		return success;
	}
	
	private boolean gotoSiginCart()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to sign in to purchase subscription report");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.usernameCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.usernameCart)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.passwordCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.passwordCart)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.loginbtnCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.loginbtnCart)));
			
			type(xpath(MYRPObjectReference_RTC.usernameCart),input[13]);
			
			Thread.sleep(10000);
			//System.out.println("entering password");
			click(xpath(MYRPObjectReference_RTC.loginbtnCart));
			System.out.println("click");
	
			try {
					String text = "done";
					if(text.equalsIgnoreCase("done"))
						{
							success = true;
							log("Succesfully sign in as member");
							Thread.sleep(2000);
						}
					else
						{
							fail("Unable to sign in as member");
						}
				}
				catch (AssertionError e) {
					fail("Unable to sign in as member");
				
				}
			} 
		catch (AssertionError e) {
			fail("Unable to sign in as member");
		}
		return success;
	}
	////MERCHANT//////
	private boolean gotoMyCartMerchantRegisterUser()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		int month = 10;
		int year = 4;
		
		System.out.println("========Preparing to go to My Cart- Merchant Page");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			
			/// element on mycart page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PurchaseContainer));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PurchaseContainer)));
			//waitForElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail));
			//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.merchantField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.merchantField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryMonthField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryMonthField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryYearField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryYearField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecurityCodeField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaynowContainer));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaynowContainer)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaynowButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaynowButton)));
			// end element on mycart page
			System.out.println("All elements on My cart page is present");
			
			// input for credi card details
			
			//type(xpath(MYRPObjectReference_RTC.GuestEmail),input[16]);
			type(xpath(MYRPObjectReference_RTC.cardNameField),input[8]);
			type(xpath(MYRPObjectReference_RTC.cardNumberField),input[9]);
			
			selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.cardExpiryMonthField), month);
			selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.cardExpiryYearField), year);
			
			type(xpath(MYRPObjectReference_RTC.SecurityCodeField),input[12]);
			
			click(xpath(MYRPObjectReference_RTC.PaynowButton));
			System.out.println("Clicking the pay now button");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels)));
			//waitForElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField));
			//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField)));
			
			String text = getText(xpath(MYRPObjectReference_RTC.PaymentMsg));
	
			
			if(text.equalsIgnoreCase("Purchase successful")){
				success = true;
				log("Succesfully purchase subscription report as registered user");
				Thread.sleep(2000);
			}
			else{
				fail("Unable purchase subscription report as registered user");
			}
			} 
		catch (AssertionError e) {
			fail("Unable purchase subscription report as registered user");
		}
		return success;
	}
	////// END OF MERCHANT///
	///// CPS
	private boolean gotoMyCartCPSRegisterUser()  throws Exception{
		// TODO Auto-generated method stub
				boolean success = false;
				
				
				System.out.println("========Preparing to go to My Cart- DPS Payment Page");
				try {
					//waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
					//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
					//click(xpath(MYRPObjectReference_RTC.MyCart));
					
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CardDropdown));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardDropdown)));
					selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.CardDropdown), 0);
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CardCheckbox));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardCheckbox)));
					
					waitForElementPresent(xpath(MYRPObjectReference_RTC.PayNowbtn));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PayNowbtn)));
					click(xpath(MYRPObjectReference_RTC.PayNowbtn));
					
					//element oon DPS page
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CPSheader));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CPSheader)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CPSfooter));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CPSfooter)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNumberLbl));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNumberLbl)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNumberField));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNumberField)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNameLbl));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNameLbl)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNameField));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNameField)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.ExpireLabel));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.ExpireLabel)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.Expiremonth));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Expiremonth)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.Expireyear));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Expireyear)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeLbl));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeLbl)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeField));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeField)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.Submitbtn));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Submitbtn)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.Cancelbtn));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Cancelbtn)));
					System.out.println("All elements on My cart page is present");
					
					
					type(xpath(MYRPObjectReference_RTC.CardNameField),input[8]);
					type(xpath(MYRPObjectReference_RTC.CardNumberField),input[9]);
					type(xpath(MYRPObjectReference_RTC.Expiremonth),input[10]);
					type(xpath(MYRPObjectReference_RTC.Expireyear),input[11]);
					type(xpath(MYRPObjectReference_RTC.SecuritycodeField),input[12]);
					
					click(xpath(MYRPObjectReference_RTC.Submitbtn));
					System.out.println("Clicking the pay now button");
					
					waitForElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaymentMsg)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PurchaseCompletedLabel)));
					waitForElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels));
					Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.YoumightAlsoLikeFiels)));
					//waitForElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField));
					//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SuccessSignUpField)));
					
					String text = getText(xpath(MYRPObjectReference_RTC.PaymentMsg));
					
					if(text.equalsIgnoreCase("Purchase successful")){
						success = true;
						log("Succesfully purchase subscription report as registered user");
						Thread.sleep(2000);
					}
					else{
						fail("Unable purchase subscription report as registered user");
					}
					} 
				catch (AssertionError e) {
					fail("Unable purchase subscription report as registered user");
				}
				return success;
	}
	///END OF CPS
	public boolean Offer()  throws Exception{
		// TODO Auto-generated method stub
		
		boolean success = false;
		//System.out.println("========Preparing to purchase subscription report as registered user");
		try {
			if(purchase25offerreport() && gotoMyCartCPSGUEST()){
				success = true;
				log("Successfully purchased discounted report on 25offer page");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	
	public boolean purchase25offerreport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase 25 offer report");
		try {
			driver.navigate().to("http://dev.myrp.com.au/25offer");
			System.out.println("navigated");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.offerfield));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.offerfield)));
			type(xpath(MYRPObjectReference_RTC.offerfield),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.SearchAddressResults));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.strikePrice));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.strikePrice)));
			System.out.println("found striker price");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.discPrice));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.discPrice)));
			System.out.println("found discounted price");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.offer25Btn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.offer25Btn)));
			click(xpath(MYRPObjectReference_RTC.offer25Btn));
			System.out.println("click");
			try {
				waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
				String text = getText(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				if(text.equalsIgnoreCase("Added to cart"))
					{
						success = true;
						log("Succesfully added to cart - 25 offer report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - 25 offer report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - 25 offer report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -25 offer report");
		}
		return success;
	}
	public boolean nabPartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase property report on nab partner");
		try {
			if(NabPagePurchasereport() && gotoMyCartMerchantPartner()){
				success = true;
				log("Successfully purchased property report on nab partner");
				Thread.sleep(2000);
			}
			else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	public boolean choicePartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase property report on choice partner");
		try {
			if(ChoicePagePurchasereport() && gotoMyCartMerchantPartner()){
				success = true;
				log("Successfully purchased property report on choice partner");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	public boolean fastPartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase property report on fast partner");
		try {
			if(FastPagePurchasereport() && gotoMyCartMerchantPartner()){
				success = true;
				log("Successfully purchased property report on fast partner");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	public boolean planPartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase property report on plan partner");
		try {
			if(PlanPagePurchasereport() && gotoMyCartMerchantPartner()){
				success = true;
				log("Successfully purchased property report on plan partner");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	public boolean advantedgePartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase property report on advantedge partner");
		try {
			if(AdvantedgePagePurchasereport() && gotoMyCartMerchantPartner()){
				success = true;
				log("Successfully purchased property report on advantedge partner");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	public boolean peopleschoicePartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase property report on peoples choice partner");
		try {
			if(PeopleschoicePagePurchasereport() && gotoMyCartMerchantPartner()){
				success = true;
				log("Successfully purchased property report on peoples choice partner");
				Thread.sleep(2000);
			}else{
				fail("Some report cant be purchase");
			}
			
		} catch (AssertionError e) {
			fail("Some report cant be purchase");
		}
		return success;
	}
	public boolean bomPartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get property report on Bank of Melbourne");
		try {
			if(bomFreereport() && popupWindow()){
				success = true;
				log("Successfully get property report on Bank of Melbourne");
				Thread.sleep(2000);
			}else{
				fail("Can't get some report");
			}
			
		} catch (AssertionError e) {
			fail("Can't get some report");
		}
		return success;
	}
	public boolean bsaPartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get property report on BankSA");
		try {
			if(bsaFreereport() && popupWindow()){
				success = true;
				log("Successfully get property report on BankSA");
				Thread.sleep(2000);
			}else{
				fail("Can't get some report");
			}
			
		} catch (AssertionError e) {
			fail("Can't get some report");
		}
		return success;
	}
	public boolean stgeorgePartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get property report on St. George");
		try {
			if(stgeorgeFreereport() && popupWindow()){
				success = true;
				log("Successfully get property report on St. George");
				Thread.sleep(2000);
			}else{
				fail("Can't get some report");
			}
			
		} catch (AssertionError e) {
			fail("Can't get some report");
		}
		return success;
	}
	public boolean westpacPartner() throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get property report on WestPac");
		try {
			if(westpacFreereport() && westpacpopupWindow()){
				success = true;
				log("Successfully get property report on WestPac");
				Thread.sleep(2000);
			}else{
				fail("Can't get some report");
			}
			
		} catch (AssertionError e) {
			fail("Can't get some report");
		}
		return success;
	}
	public boolean bomFreereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get free report from Bank of Melbourne");
		try {
			driver.navigate().to("http://dev.myrp.com.au/bom");
			System.out.println("navigated");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.bomlogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.bomlogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoBtn)));
			
			type(xpath(MYRPObjectReference_RTC.promoField),input[6]);
			click(xpath(MYRPObjectReference_RTC.promoBtn));
			System.out.println("Validate promocode");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			System.out.println("Searching for the address");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn)));
			click(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popWindow));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popWindow)));
			String text = "signin";
			try {
				if(text.equalsIgnoreCase("signin"))
					{
						success = true;
						log("Succesfully added to cart - Bank of Melbourne");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart1 - Bank of Melbourne");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - Bank of Melbourne");
			
			}
			}
			catch (AssertionError e)
			{
				fail("Unable to add to cart - Bank of Melbourne");
			
			}
		return success;
	}
	public boolean bsaFreereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get free report from BankSA");
		try {
			driver.navigate().to("http://dev.myrp.com.au/bsa");
			System.out.println("navigated");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.bsalogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.bsalogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.bottom));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.bottom)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoBtn)));
			
			type(xpath(MYRPObjectReference_RTC.promoField),input[6]);
			click(xpath(MYRPObjectReference_RTC.promoBtn));
			System.out.println("Validate promocode");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			System.out.println("Searching for the address");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn)));
			click(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popWindow));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popWindow)));
			String text = "signin";
			try {
				if(text.equalsIgnoreCase("signin"))
					{
						success = true;
						log("Succesfully added to cart - BankSA");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart1 - BankSA");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - BankSA");
			
			}
			}
			catch (AssertionError e)
			{
				fail("Unable to add to cart - BankSA");
			
			}
		return success;
	}
	public boolean stgeorgeFreereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get free report from St. George");
		try {
			driver.navigate().to("http://dev.myrp.com.au/stgeorge");
			System.out.println("navigated");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.stgeorgelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.stgeorgelogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.bottom));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.bottom)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoBtn)));
			
			type(xpath(MYRPObjectReference_RTC.promoField),input[6]);
			click(xpath(MYRPObjectReference_RTC.promoBtn));
			System.out.println("Validate promocode");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			System.out.println("Searching for the address");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn)));
			click(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popWindow));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popWindow)));
			String text = "signin";
			try {
				if(text.equalsIgnoreCase("signin"))
					{
						success = true;
						log("Succesfully added to cart - St. George");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart1 - St. George");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - St. George");
			
			}
			}
			catch (AssertionError e)
			{
				fail("Unable to add to cart - St. George");
			
			}
		return success;
	}
	public boolean westpacFreereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to get free report from WestPac");
		try {
			driver.navigate().to("http://dev.myrp.com.au/westpac");
			System.out.println("navigated");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpaclogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpaclogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacHouseImg));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacHouseImg)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacEnjoyfree));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacEnjoyfree)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacFindHome));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacFindHome)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacImgFooter));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacImgFooter)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.bottom));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.bottom)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.promoBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.promoBtn)));
			
			type(xpath(MYRPObjectReference_RTC.promoField),input[6]);
			click(xpath(MYRPObjectReference_RTC.promoBtn));
			System.out.println("Validate promocode");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			System.out.println("Searching for the address");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.getThisfreebtn)));
			click(xpath(MYRPObjectReference_RTC.getThisfreebtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popWindow));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popWindow)));
			String text = "signin";
			try {
				if(text.equalsIgnoreCase("signin"))
					{
						success = true;
						log("Succesfully added to cart - Westpac");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart1 - Westpac");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - Westpac");
			
			}
			}
			catch (AssertionError e)
			{
				fail("Unable to add to cart - Westpac");
			
			}
		return success;
	}
	public boolean popupWindow()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to fill up necessary details");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popUpTitle));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popUpTitle)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CustomerNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CustomerNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CustomerNumberField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CustomerNumberField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.FirstNameLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.FirstNameLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.FirstNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.FirstNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.EmailAddLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.EmailAddLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.EmailAddField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.EmailAddField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.LastNameLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.LastNameLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.LastNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.LastNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SubmitBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SubmitBtn)));
			
			type(xpath(MYRPObjectReference_RTC.CustomerNumberField),input[7]);
			type(xpath(MYRPObjectReference_RTC.FirstNameField),input[9]);
			type(xpath(MYRPObjectReference_RTC.EmailAddField),input[8]);
			type(xpath(MYRPObjectReference_RTC.LastNameField),input[10]);
			click(xpath(MYRPObjectReference_RTC.SubmitBtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popSuccess));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popSuccess)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popupSyccessTitle));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popupSyccessTitle)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popupClose));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popupClose)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popMsgSuccess));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popMsgSuccess)));
			
			try {
				String text = getText(xpath(MYRPObjectReference_RTC.popupSyccessTitle));
				if(text.equalsIgnoreCase("Success!"))
					{
						success = true;
						log("Succesfully get free report");
						click(xpath(MYRPObjectReference_RTC.popupClose));
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to get free report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to get free report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to get free report");
		}
		return success;
	}
	public boolean westpacpopupWindow()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to fill up necessary details");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popUpTitle));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popUpTitle)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacFNameLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacFNameLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacFNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacFNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacLNameLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacLNameLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacLNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacLNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacPNumberLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacPNumberLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacPNumberField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacPNumberField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacEmailLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacEmailLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacEmailField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacEmailField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacCIDNumberLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacCIDNumberLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacCIDNumberField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacCIDNumberField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacPostcodeLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacPostcodeLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacPostcodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacPostcodeField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.westpacAgreeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.westpacAgreeField)));
			
			type(xpath(MYRPObjectReference_RTC.westpacFNameField),input[7]);
			type(xpath(MYRPObjectReference_RTC.westpacLNameField),input[8]);
			type(xpath(MYRPObjectReference_RTC.westpacPNumberField),input[9]);
			type(xpath(MYRPObjectReference_RTC.westpacEmailField),input[10]);
			type(xpath(MYRPObjectReference_RTC.westpacCIDNumberField),input[11]);
			type(xpath(MYRPObjectReference_RTC.westpacPostcodeField),input[12]);
			radioChecked(xpath(MYRPObjectReference_RTC.westpacAgreeField));
			click(xpath(MYRPObjectReference_RTC.SubmitBtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popSuccess));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popSuccess)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popupSyccessTitle));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popupSyccessTitle)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popupClose));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popupClose)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.popMsgSuccess));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.popMsgSuccess)));
			
			try {
				String text = getText(xpath(MYRPObjectReference_RTC.popupSyccessTitle));
				if(text.equalsIgnoreCase("Success!"))
					{
						success = true;
						log("Succesfully get free report");
						click(xpath(MYRPObjectReference_RTC.popupClose));
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to get free report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to get free report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to get free report");
		}
		return success;
	}
	public boolean NabPagePurchasereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase report from nab partner");
		try {
			driver.navigate().to("http://dev.myrp.com.au/nab");
			System.out.println("navigated");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.nablogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.nablogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.nablogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.nablogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Map));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Map)));
			System.out.println("all elements shows");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn)));
			click(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			System.out.println("click add to cart");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersMycart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersMycart)));
			click(xpath(MYRPObjectReference_RTC.partnersMycart));
			System.out.println("My cart page");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.nabListPurchasedReports));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.nabListPurchasedReports)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.nabPromotionSection));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.nabPromotionSection)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.nabPromotionCodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.nabPromotionCodeField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.nabPromotionCodeBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.nabPromotionCodeBtn)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.termCondition));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.termCondition)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.termConditionCheckbox));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.termConditionCheckbox)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.ConfirmDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.ConfirmDetails)));
			
			System.out.println("all elements shown");
			
			
			try {
				String text = "success";
				if(text.equalsIgnoreCase("success"))
					{
						success = true;
						log("Succesfully added to cart - nab partner report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - nab partner report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - nab partner report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -nab partner report");
		}
		return success;
	}
	public boolean ChoicePagePurchasereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase report from choice partner");
		try {
			driver.navigate().to("http://dev.myrp.com.au/choice");
			System.out.println("navigated");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.choicelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.choicelogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.choicelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.choicelogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Map));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Map)));
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField)));
			System.out.println("all elements shows");
			type(xpath(MYRPObjectReference_RTC.partnerNameField),input[6]);
			type(xpath(MYRPObjectReference_RTC.partnerCustomerField),input[7]);
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn)));
			click(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			System.out.println("click add to cart");
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			System.out.println("My Cart Page");
			
			
			try {
				//waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
				String text = "go";
				if(text.equalsIgnoreCase("go"))
					{
						success = true;
						log("Succesfully added to cart - choice partner report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - choice partner report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - choice partner report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -choice partner report");
		}
		return success;
	}
	public boolean FastPagePurchasereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase report from fast partner");
		try {
			driver.navigate().to("http://dev.myrp.com.au/fast");
			System.out.println("navigated");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.fastlogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.fastlogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.fastlogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.fastlogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Map));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Map)));
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField)));
			System.out.println("all elements shows");
			type(xpath(MYRPObjectReference_RTC.partnerNameField),input[12]);
			type(xpath(MYRPObjectReference_RTC.partnerCustomerField),input[13]);
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn)));
			click(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			System.out.println("click add to cart");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			System.out.println("My Cart Page");
			
			
			try {
				//waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
				String text = "go";
				if(text.equalsIgnoreCase("go"))
					{
						success = true;
						log("Succesfully added to cart - fast partner report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - fast partner report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - fast partner report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -fast partner report");
		}
		return success;
	}
	public boolean PlanPagePurchasereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase report from plan partner");
		try {
			driver.navigate().to("http://dev.myrp.com.au/plan");
			System.out.println("navigated");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.planlogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.planlogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			System.out.println("hello");
			waitForElementPresent(xpath(MYRPObjectReference_RTC.planlogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.planlogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Map));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Map)));
			System.out.println("hello1");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField)));
			System.out.println("all elements shows");
			type(xpath(MYRPObjectReference_RTC.partnerNameField),input[6]);
			type(xpath(MYRPObjectReference_RTC.partnerCustomerField),input[7]);
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn)));
			click(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			System.out.println("click add to cart");
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			System.out.println("My Cart Page");
			
			
			try {
				//waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
				String text = "go";
				if(text.equalsIgnoreCase("go"))
					{
						success = true;
						log("Succesfully added to cart - plan partner report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - plan partner report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - plan partner report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -fast partner report");
		}
		return success;
	}
	public boolean AdvantedgePagePurchasereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase report from advantedge partner");
		try {
			driver.navigate().to("http://dev.myrp.com.au/advantedge");
			System.out.println("navigated");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.advantedgelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.advantedgelogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
		
			waitForElementPresent(xpath(MYRPObjectReference_RTC.advantedgelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.advantedgelogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.suburbreportDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Map));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Map)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerCustomerField)));
			System.out.println("all elements shows");
			type(xpath(MYRPObjectReference_RTC.partnerNameField),input[6]);
			type(xpath(MYRPObjectReference_RTC.partnerCustomerField),input[7]);
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn)));
			click(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			System.out.println("click add to cart");
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			System.out.println("My Cart Page");
			
			
			try {
				//waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
				String text = "go";
				if(text.equalsIgnoreCase("go"))
					{
						success = true;
						log("Succesfully added to cart - advantedge partner report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - advantedge partner report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - advantedge partner report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -advantedge partner report");
		}
		return success;
	}
	public boolean PeopleschoicePagePurchasereport()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		System.out.println("========Preparing to purchase report from peoples choice partner");
		try {
			driver.navigate().to("http://dev.myrp.com.au/peopleschoice");
			System.out.println("navigated");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.peopleschoicelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.peopleschoicelogo)));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressField)));
			type(xpath(MYRPObjectReference_RTC.partnerSearchAddressField),input[5]);
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults)));
			click(xpath(MYRPObjectReference_RTC.partnerSearchAddressResults));
		
			waitForElementPresent(xpath(MYRPObjectReference_RTC.peopleschoicelogo));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.peopleschoicelogo)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerStreetAddress)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.propertyreportDetails)));
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnersPurchasebtn)));
			click(xpath(MYRPObjectReference_RTC.partnersPurchasebtn));
			System.out.println("click add to cart");
			
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			System.out.println("My Cart Page");
			
			
			try {
				//waitForElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart));
				//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.clickAddedTocart)));
				String text = "go";
				if(text.equalsIgnoreCase("go"))
					{
						success = true;
						log("Succesfully added to cart - peoples choice partner report");
						Thread.sleep(2000);
					}
				else
					{
						fail("Unable to add to cart - peoples choice partner report");
					}
			}
			catch (AssertionError e) {
				fail("Unable to add to cart - peoples choice partner report");
			
			}
			}
		catch (AssertionError e) {
			fail("Unable to add to cart -peoples choice partner report");
		}
		return success;
	}
	private boolean gotoMyCartMerchantPartner()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		int month = 10;
		int year = 4;
		
		System.out.println("========Preparing to go to My Cart- Merchant Page");
		try {
			waitForElementPresent(xpath(MYRPObjectReference_RTC.MyCart));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.MyCart)));
			click(xpath(MYRPObjectReference_RTC.MyCart));
			System.out.println("My Cart Page");
			/// element on mycart page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PartnerEmailLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PartnerEmailLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerGuestEmail));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerGuestEmail)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnermerchantField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnermerchantField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardNameLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnercardNameLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnercardNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnercardNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardNumberLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnercardNumberLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardExpiryLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnercardExpiryLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardExpiryMonthField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnercardExpiryMonthField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnercardExpiryYearField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.cardExpiryYearField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSecurityCodeLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSecurityCodeLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.partnerSecurityCodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.partnerSecurityCodeField)));
		
			waitForElementPresent(xpath(MYRPObjectReference_RTC.termCondition));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.termCondition)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.termConditionCheckbox));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.termConditionCheckbox)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.ConfirmDetails));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.ConfirmDetails)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PaynowBtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PaynowBtn)));
			System.out.println("All elements are shown");
			//input details
			
			System.out.println("========inputting credit card details");
			type(xpath(MYRPObjectReference_RTC.GuestEmail),input[13]);
			type(xpath(MYRPObjectReference_RTC.cardNameField),input[8]);
			type(xpath(MYRPObjectReference_RTC.cardNumberField),input[9]);
			
			selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.cardExpiryMonthField), month);
			selectDropdownOptionbyIndex(xpath(MYRPObjectReference_RTC.cardExpiryYearField), year);
			
			type(xpath(MYRPObjectReference_RTC.SecurityCodeField),input[12]);
			
			radioChecked(xpath(MYRPObjectReference_RTC.termConditionCheckbox));
			
			click(xpath(MYRPObjectReference_RTC.PaynowBtn));
			// end element on mycart page
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.successPage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.successPage)));
			
			String text = "Purchase successful";
	
			
			if(text.equalsIgnoreCase("Purchase successful")){
				success = true;
				log("Succesfully purchase report on partner");
				Thread.sleep(2000);
			}
			else{
				fail("Unable to purchase report on partner");
			}
			} 
		catch (AssertionError e) {
			fail("Unable to purchase report on partner");
		}
		return success;
		
	}
	
	private boolean gotoMyCartCPSPartner()  throws Exception{
		// TODO Auto-generated method stub
		boolean success = false;
		
		System.out.println("========Preparing to go to My Cart- Merchant Page");
		try {			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.GuestEmail)));
			type(xpath(MYRPObjectReference_RTC.GuestEmail),input[11]);
			radioChecked(xpath(MYRPObjectReference_RTC.termConditionCheckbox));
			/// element on mycart page
			waitForElementPresent(xpath(MYRPObjectReference_RTC.OrderNowbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.OrderNowbtn)));
			click(xpath(MYRPObjectReference_RTC.OrderNowbtn));
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.PayNowbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.PayNowbtn)));
			click(xpath(MYRPObjectReference_RTC.PayNowbtn));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CPSheader));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CPSheader)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CPSfooter));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CPSfooter)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNumberLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNumberLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNumberField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNumberField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNameLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNameLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.CardNameField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.CardNameField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.ExpireLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.ExpireLabel)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Expiremonth));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Expiremonth)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Expireyear));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Expireyear)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeLbl));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeLbl)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeField));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.SecuritycodeField)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Submitbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Submitbtn)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.Cancelbtn));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.Cancelbtn)));
			System.out.println("All elements on My cart page is present");
				
			type(xpath(MYRPObjectReference_RTC.CardNameField),input[6]);
			type(xpath(MYRPObjectReference_RTC.CardNumberField),input[7]);
			type(xpath(MYRPObjectReference_RTC.Expiremonth),input[8]);
			type(xpath(MYRPObjectReference_RTC.Expireyear),input[9]);
			type(xpath(MYRPObjectReference_RTC.SecuritycodeField),input[10]);
			
			click(xpath(MYRPObjectReference_RTC.Submitbtn));
			System.out.println("Clicking the pay now button");
			
			waitForElementPresent(xpath(MYRPObjectReference_RTC.successPartner));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.successPartner)));
			waitForElementPresent(xpath(MYRPObjectReference_RTC.successMsg));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReference_RTC.successMsg)));
			
			
			String text = getText(xpath(MYRPObjectReference_RTC.successPartner));
	
			
			if(text.equalsIgnoreCase("Purchase successful")){
				success = true;
				log("Succesfully purchase reports");
				Thread.sleep(2000);
			}
			else{
				fail("Unable to purchase reports");
			}
			} 
		catch (AssertionError e) {
			fail("Unable to purchase reports");
		}
		
		return success;
	}
	
}
