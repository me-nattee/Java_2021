package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import ru.autoqa.Java2021.addressbook.model.PhonesData;
import ru.autoqa.Java2021.addressbook.model.SecondaryData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreationNewContact() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillBaseInformation(new ContactData("Nick", "-", "Scott", "nicc", "Jn", "Home", "Petrozavodsk"));
        app.getContactHelper().fillPhones(new PhonesData("335999", "8923294455", "3389999", "888987"));
        app.getContactHelper().fillOtherInformation(new SecondaryData("dfdfn@gmail.com", "sssf@tr.ru", "-", "-", "4", "February", "1991", "-", "-", "-", "hi!"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
