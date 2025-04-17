package stepDefinition;

import Page.HomePage;
import Page.LoginPage;
import Util.PropertyLoader;
import com.google.j2objc.annotations.Property;
import org.openqa.selenium.WebDriver;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage=new LoginPage(driver);
    public HomePage homePage=new HomePage(driver);
//  public AdminPage adminPage=new AdminPage(driver);
//  public AutoItPage autoItPage=new AutoItPage(driver);
    protected static String chromeDriver= PropertyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl= PropertyLoader.loadProperty("loginPageURL");
//    protected static String loginPageUrl1= PropertyLoader.loadProperty("loginPageURL1");
    protected static String excelFilePath= PropertyLoader.loadProperty("excelFilePath");
    protected static String excelSheet= PropertyLoader.loadProperty("excelSheet");
    protected static String autoItUploadFileSite= PropertyLoader.loadProperty("autoItUploadFileSite");
    protected static String restAssuredBaseURL= PropertyLoader.loadProperty("restAssuredBaseURL");
//  public Logger log=LogManager.getLogger();
}
