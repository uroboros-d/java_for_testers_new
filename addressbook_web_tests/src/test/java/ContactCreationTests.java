import model.Contact;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.openAddNewPage();
        app.createContact(new Contact("First name", "Last name", "Address"));
    }

    @Test
    public void canCreateContactWithEmptyName() {
        app.openAddNewPage();
        app.createContact(new Contact());
    }

    @Test
    public void canCreateContactWithNameOnly() {
        app.openAddNewPage();
        app.createContact(new Contact().withFirstName("Contact FirstName only"));
    }
}
