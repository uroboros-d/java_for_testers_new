package tests;

import model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;

public class ContactCreationTests extends TestBase {

    public static List<Contact> contactNameProvider() {
        var result = new ArrayList<Contact>();
        //построение полного набора комбинаций
        for (var firstname : List.of("", "firstname")) {
            for (var lastname : List.of("", "lastname")) {
                for (var address : List.of("", "address")) {
                    result.add(new Contact()
                            .withFirstName(firstname)
                            .withLastName(lastname)
                            .withAddress(address));
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            //добавл-ся i<5 объектов типа Contact с случ сгенерир именем
            result.add(new Contact()
                    .withFirstName("random " + randomString(i * 10))
                    .withLastName("random " + randomString(i * 10))
                    .withAddress("random " + randomString(i * 10)));
        }
        return result;
    }

    public static List<Contact> negativeContactNameProvider() {
        var result = new ArrayList<Contact>(List.of(new Contact()
                .withFirstName("FirstName'")));
        return result;
    }

    @ParameterizedTest
    @MethodSource("contactNameProvider")
    public void canCreateMultipleContacts(Contact contact) {
        int contactCount = app.contacts().getCount();
        app.contacts().createContact(contact);
        int newContactCount = app.contacts().getCount();
        Assertions.assertEquals(contactCount + 1, newContactCount);
    }

    @ParameterizedTest
    @MethodSource("negativeContactNameProvider")
    public void canNotCreateContact(Contact contact) {
        var oldContacts = app.contacts().getCount();
        app.contacts().createContact(contact);
        var newContacts = app.contacts().getCount();
        Assertions.assertEquals(newContacts, oldContacts);
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"contact Firstname", "contact Firstname'"})
//    public void canCreateContact(String name) {
//        int contactCount = app.contacts().getCount();
//        app.contacts().createContact(new Contact()
//                .withFirstName(name)
//                .withLastName("Last name")
//                .withAddress("Address"));
//        int newContactCount = app.contacts().getCount();
//        Assertions.assertEquals(contactCount + 1, newContactCount);
//    }

//    @Test
//    public void canCreateContactWithEmptyName() {
//        app.contacts().createContact(new Contact());
//    }

//    @Test
//    public void canCreateContactWithNameOnly() {
//        app.contacts().createContact(new Contact().
//                withFirstName("Contact FirstName only"));
//    }
}