package TestClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TestCase1 {

	@Test(priority = 1)
	@Description("This is a login test")
	@Severity(SeverityLevel.CRITICAL)
	@Epic("Web interface")
	@Feature("Essential features")
	@Story("Authentication")
	public void loginUser() throws FileNotFoundException {
		System.out.println("Test case pass");

	}

	@Test(priority = 2)
	@Description("This is a Registration test")
	@Severity(SeverityLevel.BLOCKER)
	public void userRegistration() {
		Assert.fail("Test case failed");
	}

	@Test(priority = 3)
	public void skiploginUser() {
		throw new SkipException("skipping the test case");
	}
}
