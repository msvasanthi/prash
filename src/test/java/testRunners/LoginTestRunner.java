package testRunners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions( plugin = {"pretty",

        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

        "timeline:test-output-thread/"

},

        monochrome = true,

        glue = { "stepDefinitions","CommonActions" },

        features = { "src/test/resources/features/Login.feature" }

)

public class LoginTestRunner extends AbstractTestNGCucumberTests {
    @Override

    @DataProvider()

    public Object[][] scenarios() {

        return super.scenarios();


    }
}
