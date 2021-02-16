package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact((new ContactData("Rita", "Black", "rita", "Jn", "Petrozavodsk", "335999", "8923294455","dfdfn@gmail.com", "ssstr.ru", "6", "February", "1990", "-", "Test1","hi!")));
        }
        app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().editContact();
        app.getContactHelper().fillBaseInformation(new ContactData("Mike", "Green", "nicc", "Jn", "Petrozavodsk", "1111999", "8921194455","dfdfn@gmail.com", "ssstr.ru", "6", "February", "1990", "4", null, "hi!"), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnToHomePage();

    }
}
