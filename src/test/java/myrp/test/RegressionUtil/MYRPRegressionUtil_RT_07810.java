package myrp.test.RegressionUtil;

import static org.openqa.selenium.By.xpath;

import java.io.IOException;
import java.util.List;

import myrp.library.MYRPObjectReferenceRT_07810;
import myrp.library.FunctionReference;
import myrp.library.ObjectReference;
import myrp.library.RegressionObjectReference;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import atu.testng.reports.ATUReports;

public class MYRPRegressionUtil_RT_07810 extends FunctionReference {

	private String[] input = null;
	private String testCase = "";

	// String winHandleBefore = "";

	public MYRPRegressionUtil_RT_07810(String[] i) {
		input = i;
		// winHandleBefore = driver.getWindowHandle();

	}

	public boolean checkLandingPages() throws Exception {

		boolean success = false;
		System.out.println("========Preparing to Check Landing Pages");
		try {
			if (gotoReportsAndServices()) {
				if (gotoPropReportsEstimatedValueReport()
						&& gotoEstimatedValueSubscription()
						&& gotoDetailedPropertyReport()
						&& gotoTitleDocument()
						&& gotoSalesHistoryReport()
						&& gotoPropertyServices()
						&& gotoDesktopValuation()
						&& gotoShortFormValuation()
						&& gotoLongFormValuation()
						&& gotoAgentsValuersAndBrokers()
						&& gotoPestBuildingAndStrataInspections()
						&& gotoStreetReports()
						&& gotoSuburbReports()
						&& gotoFreeSuburbProfle()
						&& gotoSuburbSalesReport()
						&& gotoSuburbSalesMapSubs()
						&& gotoSuburbValueMapSubs()
						&& gotoRentalInsightsReports()
						&& gotoInvestors()
						&& gotoInvestorInsightToolSubs()
						&& gotoInvestorPostcodeReport()
						&& gotoInfographics()) {
						
					//if (gotoPropertyServices()) {
						success = true;

						log("All Pages is Succesfully Visit");
						Thread.sleep(2000);
					//} else {
					//	fail("Some of Link Are Unable to Visit");
					//}
				} else {
					fail("Some of Link Are Unable to Visit");
				}
			} else {
				fail("Some of Link Are Unable to Visit");
			}
		} catch (AssertionError e) {
			fail("Some of Link Are Unable to Visit");
		}
		return success;
	}

	public boolean gotoReportsAndServices() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Reports and Services Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.reportsAndServices));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.reportsAndServices)));
			click(xpath(MYRPObjectReferenceRT_07810.reportsAndServices));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.reportsAndServicesLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.reportsAndServicesLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.reportsAndServicesLabel));

			if (text.equalsIgnoreCase("Reports and Services")) {
				success = true;
				log("Succesfully Visit the Reports and Services Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Reports and Service Link");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Reports and Service Link");
		}
		return success;
	}

	public boolean gotoPropertyServices() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Property Services Tab");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.propertySevicesButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.propertySevicesButton)));
			click(xpath(MYRPObjectReferenceRT_07810.propertySevicesButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.propertySevicesLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.propertySevicesLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.propertySevicesLabel));

			if (text.equalsIgnoreCase("Property Services")) {
				success = true;
				log("Succesfully Visit the Property Services Link");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Property Services Link");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Property Services Link");
		}
		return success;
	}

	public boolean gotoPropReportsEstimatedValueReport() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Estimated Value Report");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.propReportsEstimatedValuereportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.propReportsEstimatedValuereportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.propReportsEstimatedValuereportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.propReportsEstimatedValuereportLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.propReportsEstimatedValuereportLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.propReportsEstimatedValuereportLabel));

			if (text.contains("Estimated Value Report")) {
				if (checkLandingDetails("EVR_Reports")) {
					success = true;
					log("Succesfully Visit the Estimated Value Report");
					Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Estimated Value Report");
				}
			} else {
				fail("Unable to locate Element Estimated Value Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Estimated Value Report");
		}
		return success;
	}

	public boolean checkLandingDetails(String page) throws Exception {
		boolean success = false;
		log("========Preparing to Check Landing Details");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingDetailsText));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingDetailsText)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.landingDetailsText));
			String price = "";
			try{
				if(!page.equalsIgnoreCase("TD")){
				waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingDetailsPrice));
				Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingDetailsPrice)));
				price = getText(xpath(MYRPObjectReferenceRT_07810.landingDetailsPrice));
				}
			}catch(AssertionError e1){
				log("Landing Detail Price not applicable for "+page+"");
			}
			if (page.equalsIgnoreCase("EVR_Reports")) {
				if (text.contains(input[5]) && price.contains(input[6])) {
					checkEstimatedValueReportsElements();
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Estimated Value Report");
				}
			} else if (page.equalsIgnoreCase("EVS")) {
				if (text.contains(input[7]) && price.contains(input[8])) {
					checkEstimatedValueSubsElements();
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Estimated Value Subscription (12 months)");
				}
			} else if (page.equalsIgnoreCase("DPR")) {
				if (text.contains(input[9]) && price.contains(input[10])) {
					checkDetailedPropertyReportsElements();
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Detailed Property Report");
				}
			} else if (page.equalsIgnoreCase("TD")) {
				if (text.contains(input[11])) {
					checkTitleDocumentElements();
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Title Document");
				}
			} else if (page.equalsIgnoreCase("SHR")) {
				if (text.contains(input[13]) && price.contains(input[14])) {
					checkSalesHistoryReportsElements();
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Sales History Report");
				}
			} else if (page.equalsIgnoreCase("EVR_Services")) {
				if (text.contains(input[15]) && price.contains(input[16])) {
					checkEVR_ServicesElements();
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Estimated Value Report");
				}
			} else if (page.equalsIgnoreCase("DV")) {
				if (text.contains(input[17]) && price.contains(input[18])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Desktop Valuation");
				}
			} else if (page.equalsIgnoreCase("SFV")) {
				if (text.contains(input[19]) && price.contains(input[20])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Short Form Valuation");
				}
			} else if (page.equalsIgnoreCase("LFV")) {
				if (text.contains(input[21]) && price.contains(input[22])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Long Form Valuation");
				}
			} else if (page.equalsIgnoreCase("SSR")) {
				if (text.contains(input[23]) && price.contains(input[24])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Street Sales Report");
				}
			} else if (page.equalsIgnoreCase("FSP")) {
				if (text.contains(input[25]) && price.contains(input[26])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Free Suburb Profile");
				}
			} else if (page.equalsIgnoreCase("SubSales_Report")) {
				if (text.contains(input[27]) && price.contains(input[28])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Suburb Sales Report");
				}
			} else if (page.equalsIgnoreCase("SSMS")) {
				if (text.contains(input[29]) && price.contains(input[30])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Suburb Sales Map Subscription (3 months)");
				}
			} else if (page.equalsIgnoreCase("SVMS")) {
				if (text.contains(input[31]) && price.contains(input[32])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Suburb Value Map Subscription (3 months)");
				}
			} else if (page.equalsIgnoreCase("RIR")) {
				if (text.contains(input[33]) && price.contains(input[34])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Rental Insights Report");
				}
			} else if (page.equalsIgnoreCase("IITS")) {
				if (text.contains(input[35]) && price.contains(input[36])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Investor Insight Tool Subscription (3 months)");
				}
			} else if (page.equalsIgnoreCase("IPR")) {
				if (text.contains(input[37]) && price.contains(input[38])) {
					success = true;
					pass("========All elements are visible");
				} else {
					fail("Unable to locate Element Investor Postcode Report");
				}
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Landing Details Page");
		}
		return success;
	}

	public boolean gotoEstimatedValueSubscription() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Estimated Value Subscription Link");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.estimatedValueSubscriptionButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.estimatedValueSubscriptionButton)));
			click(xpath(MYRPObjectReferenceRT_07810.estimatedValueSubscriptionButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.estimatedValueSubscriptionLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.estimatedValueSubscriptionLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.estimatedValueSubscriptionLabel));

			if (text.contains("Estimated Value Subscription (12 months)")) {
				if (checkLandingDetails("EVS")) {
					success = true;
					log("Succesfully Visit the Estimated Value Subscription (12 months)");
					Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Estimated Value Subscription (12 months)");
				}
			} else {
				fail("Unable to locate Element Estimated Value Subscription ");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Estimated Value Subscription Page");
		}
		return success;
	}

	public boolean gotoDetailedPropertyReport() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Detailed Property Report Button");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.detailedPropreportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.detailedPropreportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.detailedPropreportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.detailedPropreportLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.detailedPropreportLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.detailedPropreportLabel));

			if (text.contains("Detailed Property Report")) {
				if (checkLandingDetails("DPR")) {
					success = true;
					log("Succesfully Visit the Detailed Property Report Page");
					Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Detailed Property Report Page");
				}
			} else {
				fail("Unable to locate Detailed Property Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Detailed Property Report");
		}
		return success;
	}

	public boolean gotoTitleDocument() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Title Document Button");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.titleDocumentButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.titleDocumentButton)));
			click(xpath(MYRPObjectReferenceRT_07810.titleDocumentButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.titleDocumentLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.titleDocumentLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.titleDocumentLabel));

			if (text.contains("Title Document")) {
				if (checkLandingDetails("TD")) {
				success = true;
				log("Succesfully Visit the Title Document Report Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Title Document Report Page");
				}
			} else {
				fail("Unable to locate Title Document Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Title Document Report");
		}
		return success;
	}

	public boolean gotoSalesHistoryReport() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Sales History Report Button");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.salesHistoryReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.salesHistoryReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.salesHistoryReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.salesHistoryReportLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.salesHistoryReportLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.salesHistoryReportLabel));

			if (text.contains("Sales History Report")) {
				if (checkLandingDetails("SHR")) {
				success = true;
				log("Succesfully Visit the Sales History Report Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Sales History Report Page");
				}
			} else {
				fail("Unable to locate Sales History Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Sales History Report");
		}
		return success;
	}

	public boolean gotoDesktopValuation() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Click the Desktop Valuation");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.desktopValuationButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.desktopValuationButton)));
			click(xpath(MYRPObjectReferenceRT_07810.desktopValuationButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.desktopValuationLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.desktopValuationLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.desktopValuationLabel));

			if (text.contains("Desktop Valuation")) {
				if (checkLandingDetails("DV")) {
				success = true;
				log("Succesfully Visit the Desktop Valuation Report");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Desktop Valuation Report");
				}
			} else {
				fail("Unable to locate Element Desktop Valuation Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Desktop Valuation Report");
		}
		return success;
	}

	public boolean gotoShortFormValuation() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Short Form Valuation");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.shortFormValuationButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.shortFormValuationButton)));
			click(xpath(MYRPObjectReferenceRT_07810.shortFormValuationButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.shortFormValuationLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.shortFormValuationLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.shortFormValuationLabel));

			if (text.contains("Short Form Valuation")) {
				if (checkLandingDetails("SFV")) {
				success = true;
				log("Succesfully Visit the Short Form Valuation Report");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Short Form Valuation Report");
				}
			} else {
				fail("Unable to locate Element Short Form Valuation Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Short Form Valuation Report");
		}
		return success;
	}

	public boolean gotoLongFormValuation() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Long Form Valuation");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.longFormValuttionButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.longFormValuttionButton)));
			click(xpath(MYRPObjectReferenceRT_07810.longFormValuttionButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.longFormValuttionLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.longFormValuttionLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.longFormValuttionLabel));

			if (text.contains("Long Form Valuation")) {
				if (checkLandingDetails("LFV")) {
				success = true;
				log("Succesfully Visit the Long Form Valuation Report");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Long Form Valuation Report");
				}
			} else {
				fail("Unable to locate Element Long Form Valuation Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Long Form Valuation Report");
		}
		return success;
	}

	public boolean gotoAgentsValuersAndBrokers() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Click the Agents, Valuers and Brokers");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.agentValuerBrokerButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.agentValuerBrokerButton)));
			click(xpath(MYRPObjectReferenceRT_07810.agentValuerBrokerButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.agentValuerBrokerLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.agentValuerBrokerLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.agentValuerBrokerLabel));

			if (text.contains("Find local agents, valuers and brokers")) {
				success = true;
				log("Succesfully Visit the Agents, Valuers and Brokers");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Agents, Valuers and Brokers");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Agents, Valuers and Brokers");
		}
		return success;
	}

	public boolean gotoPestBuildingAndStrataInspections() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Agents, Valuers and Brokers");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataButton)));
			click(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataLabel));

			goToNextBrowserTab();
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataNextBrowser));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataNextBrowser)));
			goToPreviousBrowserTab(testCase);

			if (isElementPresent(xpath(MYRPObjectReferenceRT_07810.petsBuildingandStrataLabel))) {
				success = true;
				log("Succesfully Visit the Agents, Valuers and Brokers");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Agents, Valuers and Brokers");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Agents, Valuers and Brokers");
		}
		return success;
	}

	public boolean gotoStreetReports() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Click the Street Reports Tab");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.streetReportsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.streetReportsButton)));
			click(xpath(MYRPObjectReferenceRT_07810.streetReportsButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.streetReportsLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.streetReportsLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.streetReportsLabel));

			if (text.equalsIgnoreCase("Street Reports")) {
				if (checkLandingDetails("SSR")) {
				success = true;
				log("Succesfully Visit the Street Reports Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Street Reports Page");
				}
			} else {
				fail("Unable to locate Element Street Reports Tab");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Street Reports Tab");
		}
		return success;
	}

	public boolean gotoSuburbReports() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Click the Suburb Reports Tab");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbReportsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbReportsButton)));
			click(xpath(MYRPObjectReferenceRT_07810.suburbReportsButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbReportsLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbReportsLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.suburbReportsLabel));

			if (text.contains("Suburb Reports")) {
				success = true;
				log("Succesfully Visit the Suburb Reports Tab");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Suburb Reports Tab");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Suburb Reports Tab");
		}
		return success;
	}

	public boolean gotoFreeSuburbProfle() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Free Suburb Profile");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.freeSuburbProfileButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.freeSuburbProfileButton)));
			click(xpath(MYRPObjectReferenceRT_07810.freeSuburbProfileButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.freeSuburbProfileLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.freeSuburbProfileLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.freeSuburbProfileLabel));

			if (text.contains("Free Suburb Profile")) {
				if (checkLandingDetails("FSP")) {
				success = true;
				log("Succesfully Visit the Free Suburb Profile Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Free Suburb Profile Page");
				}
			} else {
				fail("Unable to locate Element Free Suburb Profile");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Free Suburb Profile");
		}
		return success;
	}

	public boolean gotoSuburbSalesReport() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Suburb Sales Report");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.suburbSalesReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesReportLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesReportLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.suburbSalesReportLabel));

			if (text.contains("Suburb Sales Report")) {
				if (checkLandingDetails("SubSales_Report")) {
				success = true;
				log("Succesfully Visit the Suburb Sales Report Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Suburb Sales Report Page");
				}
			} else {
				fail("Unable to locate Element Suburb Sales Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Suburb Sales Report");
		}
		return success;
	}

	public boolean gotoSuburbSalesMapSubs() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Suburb Sales Map Subscription");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesMapSubscriptionButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesMapSubscriptionButton)));
			click(xpath(MYRPObjectReferenceRT_07810.suburbSalesMapSubscriptionButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesMapSubscriptionLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbSalesMapSubscriptionLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.suburbSalesMapSubscriptionLabel));

			if (text.contains("Suburb Sales Map Subscription (3 months)")) {
				if (checkLandingDetails("SSMS")) {
				success = true;
				log("Succesfully Visit the Suburb Sales Map Subscription Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Suburb Sales Map Subscription Page");
				}
			} else {
				fail("Unable to locate Element Suburb Sales Map Subscription");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Suburb Sales Map Subscription");
		}
		return success;
	}

	public boolean gotoSuburbValueMapSubs() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Suburb Value Map Subscription");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbValueMapSubscriptionButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbValueMapSubscriptionButton)));
			click(xpath(MYRPObjectReferenceRT_07810.suburbValueMapSubscriptionButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbValueMapSubscriptionLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.suburbValueMapSubscriptionLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.suburbValueMapSubscriptionLabel));

			if (text.contains("Suburb Value Map Subscription (3 months)")) {
				if (checkLandingDetails("SVMS")) {
				success = true;
				log("Succesfully Visit the Suburb Value Map Subscription Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Suburb Value Map Subscription Page");
				}
			} else {
				fail("Unable to locate Element Suburb Value Map Subscription");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Suburb Value Map Subscription");
		}
		return success;
	}

	public boolean gotoRentalInsightsReports() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Rental Insights Report");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.rentalInsightsReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.rentalInsightsReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.rentalInsightsReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.rentalInsightsReportLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.rentalInsightsReportLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.rentalInsightsReportLabel));

			if (text.contains("Rental Insights Report")) {
				if (checkLandingDetails("RIR")) {
				success = true;
				log("Succesfully Visit the Rental Insights Report Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Rental Insights Report Page");
				}
			} else {
				fail("Unable to locate Element Rental Insights Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Rental Insights Report");
		}
		return success;
	}

	public boolean gotoInvestors() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Click the Investors Tab");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsButton)));
			click(xpath(MYRPObjectReferenceRT_07810.investorsButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.investorsLabel));

			if (text.contains("Property Investor Insight")) {
				success = true;
				log("Succesfully Visit the Property Investor Insight");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Property Investor Insight");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Property Investor Insight");
		}
		return success;
	}

	public boolean gotoInvestorInsightToolSubs() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Investor Insight Tool Subscription");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsInsightToolSubsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsInsightToolSubsButton)));
			click(xpath(MYRPObjectReferenceRT_07810.investorsInsightToolSubsButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsInsightToolSubsLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.investorsInsightToolSubsLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.investorsInsightToolSubsLabel));

			if (text.contains("Investor Insight Tool Subscription (3 months)")) {
				if (checkLandingDetails("IITS")) {
					success = true;
					log("Succesfully Visit the Investor Insight Tool Subscription (3 months) Page");
					Thread.sleep(2000);
					} else {
						fail("Unable to locate Element Investor Insight Tool Subscription (3 months) Page");
					}
			} else {
				fail("Unable to locate Element Investor Insight Tool Subscription (3 months)");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Investor Insight Tool Subscription (3 months)");
		}
		return success;
	}

	public boolean gotoInvestorPostcodeReport() throws Exception {
		boolean success = false;
		System.out
				.println("========Preparing to Click the Investor Postcode Report");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.investorPostcodeReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.investorPostcodeReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.investorPostcodeReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.investorPostcodeReportLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.investorPostcodeReportLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.investorPostcodeReportLabel));

			if (text.contains("Investor Postcode Report")) {
				if (checkLandingDetails("IPR")) {
				success = true;
				log("Succesfully Visit the Investor Postcode Report Page");
				Thread.sleep(2000);
				} else {
					fail("Unable to locate Element Investor Postcode Report Page");
				}
			} else {
				fail("Unable to locate Element Investor Postcode Report");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Investor Postcode Report");
		}
		return success;
	}

	public boolean gotoInfographics() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Click the Infographics Tab");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.infographicsButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.infographicsButton)));
			click(xpath(MYRPObjectReferenceRT_07810.infographicsButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.infographicsLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.infographicsLabel)));
			String text = getText(xpath(MYRPObjectReferenceRT_07810.infographicsLabel));

			if (text.contains("Property Snapshot Infographic")) {
				success = true;
				log("Succesfully Visit the Infographics Page");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element Infographics");
			}
		} catch (AssertionError e) {
			fail("Unable to locate Element Infographics");
		}
		return success;
	}
	
	public boolean checkEstimatedValueReportsElements() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Property Reports Estimated Value Reports Elements");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm)));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink)));
			Thread.sleep(2000);
	
			String text = getText(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));

			if (text.contains("Hide panel")) {
				success = true;
				log("Hide panel is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Hide Panel link");
			}
			
			click(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel)));
			Thread.sleep(2000);

			String whatYouGetLabel = getText(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));

			if (whatYouGetLabel.contains("What you get:")) {
				success = true;
				log("What you get: is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate What You get Elements");
			}
			
			checkSampleEstimatedValueReportsImages();
			checkSample6RecentSalesImages();
			checkSampleSuburbStatsImage();
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.EVRdownloadFullSamplePdf));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.EVRdownloadFullSamplePdf)));
			click(xpath(MYRPObjectReferenceRT_07810.EVRdownloadFullSamplePdf));
			Thread.sleep(2000);
					
		} catch (AssertionError e) {
			fail("Unable to Check Property Reports Estimated Value Reports Elements");
		}
		return success;
	}
	
	public boolean checkSampleEstimatedValueReportsImages() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample Estimated Value Reports Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleEstimatedValueReportImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleEstimatedValueReportImage)));
			click(xpath(MYRPObjectReferenceRT_07810.sampleEstimatedValueReportImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("Estimated value of a property")) {
				success = true;
				log("Successfully check Estimated value Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Estimated value Content Modal");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Sample Estimated Value Reports Images");
		}
		return success;
	}
	
	public boolean checkSample6RecentSalesImages() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample 6 Recent Sales Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.sample6RecentSalesImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.sample6RecentSalesImage)));
			click(xpath(MYRPObjectReferenceRT_07810.sample6RecentSalesImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("6 recent sales")) {
				success = true;
				log("Successfully check 6 Recent Sales Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate 6 Recent Sales Elements ");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Sample 6 Recent Sales Elements");
		}
		return success;
	}
	
	public boolean checkSampleSuburbStatsImage() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample Suburb Statistics Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleSuburbStatsImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleSuburbStatsImage)));
			click(xpath(MYRPObjectReferenceRT_07810.sampleSuburbStatsImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("Suburb statistics")) {
				success = true;
				log("Successfully check Suburb statistics Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Suburb statistics Elements ");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Sample Suburb Statistics Images");
		}
		return success;
	}
	
	public boolean checkEstimatedValueSubsElements() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Property Reports Estimated Value Subscriptions Elements");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm)));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink)));
			Thread.sleep(2000);
	
			String text = getText(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));

			if (text.contains("Hide panel")) {
				success = true;
				log("Hide panel is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Hide Panel link");
			}
			
			click(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			
		} catch (AssertionError e) {
			fail("Unable to Check Property Reports Estimated Value Subscriptions Elements");
		}
		return success;
	}
	
	public boolean checkDetailedPropertyReportsElements() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Detailed Property Reports Elements");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm)));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink)));
			Thread.sleep(2000);
	
			String text = getText(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));

			if (text.contains("Hide panel")) {
				success = true;
				log("Hide panel is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Hide Panel link");
			}
			
			click(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel)));
			Thread.sleep(2000);

			String whatYouGetLabel = getText(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));

			if (whatYouGetLabel.contains("What you get:")) {
				success = true;
				log("What you get: is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate What You get Elements");
			}
			
			checkSampleDetailedPropertyReportImages();
			checkPrevSalesImages();
			checkSampleRecentSuburbSalesImage();
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf)));
			click(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to Check Detailed Property Reports Elements");
		}
		return success;
	}
	
	public boolean checkSampleDetailedPropertyReportImages() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample Detailed Property Reports Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleDetailedPropertyReportImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleDetailedPropertyReportImage)));
			click(xpath(MYRPObjectReferenceRT_07810.sampleDetailedPropertyReportImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("Estimated value of a property")) {
				success = true;
				log("Successfully check Estimated value Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Estimated value Content Modal");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Sample Estimated Value Reports Images");
		}
		return success;
	}
	
	public boolean checkPrevSalesImages() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample Previous Sales for this Property Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.samplePrevSalesPropertyImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.samplePrevSalesPropertyImage)));
			click(xpath(MYRPObjectReferenceRT_07810.samplePrevSalesPropertyImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("Previous sales for this property")) {
				success = true;
				log("Successfully check Previous sales for this property Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Previous sales for this property Elements ");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Previous sales for this property Elements");
		}
		return success;
	}
	
	public boolean checkSampleRecentSuburbSalesImage() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample Suburb Statistics Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleRecentSuburbSalesImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleRecentSuburbSalesImage)));
			click(xpath(MYRPObjectReferenceRT_07810.sampleRecentSuburbSalesImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("Recent suburb sales")) {
				success = true;
				log("Successfully check Recent suburb sales Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Recent suburb sales Elements ");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Sample Suburb Statistics Images");
		}
		return success;
	}
	
	public boolean checkTitleDocumentElements() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Title Document Elements");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getTitleDocumentButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getTitleDocumentButton)));
			click(xpath(MYRPObjectReferenceRT_07810.getTitleDocumentButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getTitleDocumentForm));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getTitleDocumentForm)));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.LandingHidePanelLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.LandingHidePanelLink)));
			Thread.sleep(2000);
	
			String text = getText(xpath(MYRPObjectReferenceRT_07810.LandingHidePanelLink));

			if (text.contains("Hide panel")) {
				success = true;
				log("Hide panel is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Hide Panel link");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocumentNswButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocumentNswButton)));
			click(xpath(MYRPObjectReferenceRT_07810.TitleDocumentNswButton));
			Thread.sleep(2000);
			
			goToNextBrowserTab();
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocuNswNextBrowser));
			//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocuNswNextBrowser)));
			goToPreviousBrowserTab(testCase);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocumentVicButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocumentVicButton)));
			click(xpath(MYRPObjectReferenceRT_07810.TitleDocumentVicButton));
			Thread.sleep(2000);
			
			goToNextBrowserTab();
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocuVicNextBrowser));
			//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocuVicNextBrowser)));
			goToPreviousBrowserTab(testCase);
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocumentQldButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocumentQldButton)));
			click(xpath(MYRPObjectReferenceRT_07810.TitleDocumentQldButton));
			Thread.sleep(2000);
			
			goToNextBrowserTab();
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocuQldNextBrowser));
			//Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.TitleDocuQldNextBrowser)));
			goToPreviousBrowserTab(testCase);
			
			if (isElementPresent(xpath(MYRPObjectReferenceRT_07810.LandingHidePanelLink))) {
				success = true;
				log("Succesfully Visit the States on Get Title Doument");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Element in the States on Get Title Doument");
			}
			
			click(xpath(MYRPObjectReferenceRT_07810.LandingHidePanelLink));
			
		} catch (AssertionError e) {
			fail("Unable to Check Title Document Elements");
		}
		return success;
	}
	
	public boolean checkSalesHistoryReportsElements() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sales History Reports Elements");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm)));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink)));
			Thread.sleep(2000);
	
			String text = getText(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));

			if (text.contains("Hide panel")) {
				success = true;
				log("Hide panel is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Hide Panel link");
			}
			
			click(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel)));
			Thread.sleep(2000);

			String whatYouGetLabel = getText(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));

			if (whatYouGetLabel.contains("What you get:")) {
				success = true;
				log("What you get: is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate What You get Elements");
			}
			
			checkSampleSalesHistoryReportImages();
					
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf)));
			click(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to Check Sales History Reports Elements");
		}
		return success;
	}
	
	public boolean checkSampleSalesHistoryReportImages() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check Sample Sales History Reports Images");
		try {
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleSalesHistoryReportImage));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.sampleSalesHistoryReportImage)));
			click(xpath(MYRPObjectReferenceRT_07810.sampleSalesHistoryReportImage));
			Thread.sleep(2000);
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.checkContentModal)));
			click(xpath(MYRPObjectReferenceRT_07810.checkContentModal));
			Thread.sleep(2000);
			
			String contentModal = getText(xpath(MYRPObjectReferenceRT_07810.checkContentModal));

			if (contentModal.contains("Complete sales history")) {
				success = true;
				log("Successfully check Complete sales history Content Modal");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Complete sales history Content Modal");
			}
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.closeButtonModal)));
			click(xpath(MYRPObjectReferenceRT_07810.closeButtonModal));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to locate Sample Sales History Reports Images");
		}
		return success;
	}
	
	public boolean checkEVR_ServicesElements() throws Exception {
		boolean success = false;
		System.out.println("========Preparing to Check EVR Services Elements");
		try {
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.getThisReportButton)));
			click(xpath(MYRPObjectReferenceRT_07810.getThisReportButton));
			Thread.sleep(2000);

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.landingSearchForm)));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink)));
			Thread.sleep(2000);
	
			String text = getText(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));

			if (text.contains("Hide panel")) {
				success = true;
				log("Hide panel is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate Hide Panel link");
			}
			
			click(xpath(MYRPObjectReferenceRT_07810.searchHidePanelLink));
			
			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel)));
			Thread.sleep(2000);

			String whatYouGetLabel = getText(xpath(MYRPObjectReferenceRT_07810.whatYouGetLabel));

			if (whatYouGetLabel.contains("What you get:")) {
				success = true;
				log("What you get: is displayed");
				Thread.sleep(2000);
			} else {
				fail("Unable to locate What You get Elements");
			}
			
			checkSampleEstimatedValueReportsImages();
			checkSample6RecentSalesImages();
			checkSampleSuburbStatsImage();

			waitForElementPresent(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf));
			Assert.assertTrue(isElementPresent(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf)));
			click(xpath(MYRPObjectReferenceRT_07810.DPRdownloadFullSamplePdf));
			Thread.sleep(2000);
			
		} catch (AssertionError e) {
			fail("Unable to Check Detailed Property Reports Elements");
		}
		return success;
	}
	
	
}