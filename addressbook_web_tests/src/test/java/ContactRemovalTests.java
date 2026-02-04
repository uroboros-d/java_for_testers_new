import model.Contact;
import org.junit.jupiter.api.Test;

public class ContactRemovalTests extends TestBase {

    @Test
    public void canRemoveContact() {
        app.openHomePage();
        if (! app.isContactPresent()) {
            app.openAddNewPage();
            app.createContact(new Contact("First name to delete", "Last name to delete", "Address to delete"));
        }
        app.removeContact();
    }

}
