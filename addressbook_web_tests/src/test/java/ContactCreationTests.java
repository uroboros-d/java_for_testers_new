import model.Contact;
import model.Group;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        openAddNewPage();
        createContact(new Contact("First name", "Last name", "Address"));
    }

    @Test
    public void canCreateContactWithEmptyName() {
        openAddNewPage();
        createContact(new Contact());
    }

    @Test
    public void canCreateContactWithNameOnly() {
        openAddNewPage();
        createContact(new Contact().withFirstName("Contact FirstName only"));
    }
}
