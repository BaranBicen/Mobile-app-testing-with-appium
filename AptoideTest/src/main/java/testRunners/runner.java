package testRunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import util.DriverFactory;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions", "util"}, // Adjust package names as per your project structure
        tags = "",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html"
        }
)
public class runner extends AbstractTestNGCucumberTests {
        private static AppiumDriver driver;

        @BeforeClass(alwaysRun = true)
        public static void setUp() {
                driver = DriverFactory.getDriver();
        }

        public AppiumDriver getDriver() {
                return driver;
        }
}
