//
//import static org.junit.Assert.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.junit.Test;
//
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class GreetingControllerTest {
//    @Test
//    public void body_tag_exist() {
//        WebDriver browser;
//        //Firefox's geckodriver *requires* you to specify its location.
//        System.setProperty("webdriver.gecko.driver", "c:\\GECKO\\geckodriver.exe");
//        browser = new FirefoxDriver();
//        browser.get("http://localhost:8080/greeting");
//        WebElement tag = browser.findElement(By.tagName("body"));
//        assertTrue((tag.isDisplayed()));
//        browser.quit();
//    }
//
//    @Test
//    public void google_test_search_cheese() {
//        System.setProperty("webdriver.gecko.driver", "c:\\GECKO\\geckodriver.exe");
//        // Create a new instance of the Firefox driver
//        // Notice that the remainder of the code relies on the interface,
//        // not the implementation.
//        WebDriver driver = new FirefoxDriver();
//
//        // And now use this to visit Google
//        driver.get("http://www.google.com");
//        // Alternatively the same thing can be done like this
//        // driver.navigate().to("http://www.google.com");
//
//        // Find the text input element by its name
//        WebElement element = driver.findElement(By.name("q"));
//
//        // Enter something to search for
//        element.sendKeys("Cheese!");
//
//        // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();
//
//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
//
//        // Google's search is rendered dynamically with JavaScript.
//        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });
//
//        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
//
//        //Close the browser
//        driver.quit();
//    }
//}
