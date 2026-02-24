package manager;

import model.Contact;
import model.Group;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class ContactHelper {

    private final ApplicationManager manager;
    public ContactHelper(ApplicationManager manager) {
        this.manager = manager;
    }

    public void createContact (Contact сontact){
        openAddNewPage();
        manager.driver.findElement(By.name("firstname")).sendKeys(сontact.firstName());
        manager.driver.findElement(By.name("lastname")).sendKeys(сontact.lastName());
        manager.driver.findElement(By.name("address")).sendKeys(сontact.address());
        manager.driver.findElement(By.name("submit")).click();
        manager.driver.findElement(By.linkText("home")).click();
    }

    public boolean isContactPresent() {
        manager.timeout(1000);
        return manager.isElementPresent(By.name("selected[]"));
    }

    public void removeContact() {
        openHomePage();
        manager.driver.findElement(By.name("selected[]")).click();
        manager.driver.findElement(By.name("delete")).click();
    }

    public void openAddNewPage() {
        manager.timeout(1000);
        if (!manager.isElementPresent(By.name("submit"))) {
            manager.driver.findElement(By.linkText("add new")).click();
        }
    }

    public void openHomePage() {
        manager.timeout(1000);
        if (!manager.isElementPresent(By.name("searchstring"))) {
            manager.driver.findElement(By.linkText("home")).click();
        }
    }

    public int getCount() {
        openHomePage();
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    public Object getList() {
        openHomePage();
        var contacts = new ArrayList<Contact>();
        var tds = manager.driver.findElements(By.cssSelector("td.center"));
        for (var td : tds) {
            var name = td.getText();
            var checkbox = td.findElement(By.name("selected[]"));
            var id = checkbox.getAttribute("value");
            contacts.add(new Contact().withId(id).withFirstName(name));
        }
        return contacts;

    }
}
