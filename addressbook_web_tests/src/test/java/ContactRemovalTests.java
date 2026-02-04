import model.Contact;
import org.junit.jupiter.api.Test;

public class ContactRemovalTests extends TestBase {

    @Test
    public void canRemoveContact() {
        openHomePage();
        if (! isContactPresent()) {
            openAddNewPage();
            createContact(new Contact("First name to delete", "Last name to delete", "Address to delete"));
        }
        removeContact();
    }

}
