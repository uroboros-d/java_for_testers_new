import model.Contact;
import model.Group;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        openAddNewPage();
        createContact(new Contact("First name", "Last name", "Address"));
    }
}
