package tests;

import model.Contact;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ContactRemovalTests extends TestBase {

    @Test
    public void canRemoveContact() {
        if (! app.contacts().isContactPresent()) {
            app.contacts().createContact(new Contact()
                    .withFirstName("First name to delete")
                    .withLastName("Last name to delete")
                    .withAddress("Address to delete"));
        }
        var oldContacts = app.contacts().getList();
        var rnd = new Random();
        //var index = rnd.nextInt(oldContacts.size());
        app.contacts().removeContact();
    }

}
