package tests;

import model.Contact;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.contacts().createContact(new Contact("First name", "Last name", "Address"));
    }

    @Test
    public void canCreateContactWithEmptyName() {
        app.contacts().createContact(new Contact());
    }

    @Test
    public void canCreateContactWithNameOnly() {
        app.contacts().createContact(new Contact().withFirstName("Contact FirstName only"));
    }
}
