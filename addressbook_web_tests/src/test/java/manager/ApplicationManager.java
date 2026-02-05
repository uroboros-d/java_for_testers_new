package manager;

import model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//в нем методы для управления приложением
public class ApplicationManager {

    protected WebDriver driver;
    private LoginHelper session;
    private GroupHelper groups;

    public void init() {
        if (driver == null) {
            driver = new FirefoxDriver();
            //перед завершением работы Java завершает работу драйвера:
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));

            driver.get("http://localhost/addressbook/index.php");
            driver.manage().window().setSize(new Dimension(854, 694));
            session().login("admin", "secret");
        }
    }

    public LoginHelper session() {
        if (session == null) {
            session = new LoginHelper(this);
        }
        return session;
    }

    public GroupHelper groups() {
        if (groups == null) {
            groups = new GroupHelper(this);
        }
        return groups;
    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    public void createContact (Contact сontact){
        timeout(1000);
        driver.findElement(By.name("firstname")).sendKeys(сontact.firstName());
        driver.findElement(By.name("lastname")).sendKeys(сontact.lastName());
        driver.findElement(By.name("address")).sendKeys(сontact.address());
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("home")).click();
    }

    private void timeout(int ms) {
        //тайм аут ms миллисекунд
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException("Pause");
        }
    }

    public boolean isContactPresent() {
        timeout(1000);
        return isElementPresent(By.name("selected[]"));
    }

    public void removeContact() {
        timeout(1000);
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.name("delete")).click();
    }

    public void openAddNewPage() {
        timeout(1000);
        if (!isElementPresent(By.name("submit"))) {
            driver.findElement(By.linkText("add new")).click();
        }
    }

    public void openHomePage() {
        timeout(1000);
        if (!isElementPresent(By.name("searchstring"))) {
            driver.findElement(By.linkText("home")).click();
        }
    }
}
