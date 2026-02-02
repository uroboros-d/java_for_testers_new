import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class GroupRemovalTests extends TestBase {

    @Test
    public void canRemoveGroup() {
        if (! isElementPresent(By.name("new"))) {
            driver.findElement(By.linkText("groups")).click();
        }
        if (! isElementPresent(By.name("selected[]"))) {
            createGroup("group two", "group two header", "group two footer");
        }
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.name("delete")).click();
        driver.findElement(By.linkText("groups")).click();
    }
}