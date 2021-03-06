import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
    private static WebDriver webDriver;

    public Setup(WebDriver webDriver) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        Setup.webDriver = new ChromeDriver(options);
        Setup.webDriver.manage().window().maximize();
        Setup.webDriver = webDriver;

    }

    public void startApplication() {
        webDriver.get("http://automationpractice.com/index.php");
    }
    public void exitApplication(){ webDriver.quit(); }
}
