package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreationNewContact() throws Exception {
        app.getContactHelper().createContact(new ContactData("Rita", "Black", "rita", "Jn", "Petrozavodsk", "335999", "8923294455","dfdfn@gmail.com", "ssstr.ru", "6", "February", "1990", "-", "Test1","hi!"));
        app.getNavigationHelper().returnToHomePage();
    }

}
