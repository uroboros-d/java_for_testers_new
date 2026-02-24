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
        //список элементов tr,найденных по name
        var trs = manager.driver.findElements(By.name("entry"));
        for (var tr : trs) {
            var cells = tr.findElements(By.tagName("td"));
            var id = cells.get(0).findElement(By.tagName("input")).getAttribute("id");
            var lastname = cells.get(1).getText();
            var firstname = cells.get(2).getText();
            var address = cells.get(2).getText();
            contacts.add(new Contact()
                    .withId(id)
                    .withLastName(lastname)
                    .withFirstName(firstname)
                    .withAddress(address));
        }
        return contacts;
    }
}
