import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SeleniumTesting
{
    @Test
    public void googleTest() {
        System.setProperty("webdriver.gecko.driver", "c:\\WebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            driver.get("http://google.com/ncr");
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(firstResult.getText());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().back();
            driver.navigate().refresh();
            driver.findElement(By.name("q")).sendKeys("Michael Angelo" + Keys.ENTER);
            //driver.findElement(By.name("btnK")).click();
            WebElement firstResultA = wait.until(presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(firstResultA.getText());
        } finally {
            driver.quit();
        }
    }

    @Test
    public void sampleAlert()
    {
        System.setProperty("webdriver.gecko.driver", "c:\\WebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            driver.get("https://seleniumhq.github.io/docs/wd.html#driver_requirements");
            driver.findElement(By.linkText("See an example alert")).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String text = alert.getText();
            System.out.println(text);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            alert.accept();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void sampleConfirm()
    {
            System.setProperty("webdriver.gecko.driver", "c:\\WebDriver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, 10);

            try {
                driver.get("https://seleniumhq.github.io/docs/wd.html#driver_requirements");
                driver.findElement(By.linkText("See a sample confirm")).click();
                wait.until(ExpectedConditions.alertIsPresent());

                Alert alert = driver.switchTo().alert();
                String text = alert.getText();
                System.out.println(text);

                alert.dismiss();
            } finally {
                driver.quit();
            }
    }

    @Test
    public void samplePrompt()
    {
        System.setProperty("webdriver.gecko.driver", "c:\\WebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            driver.get("https://seleniumhq.github.io/docs/wd.html#driver_requirements");
            driver.findElement(By.linkText("See a sample prompt")).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            alert.sendKeys("Selenium");
            alert.accept();
        } finally {
            driver.quit();
        }
    }
}
