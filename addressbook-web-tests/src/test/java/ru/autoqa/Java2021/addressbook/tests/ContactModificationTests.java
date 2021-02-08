package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().editContact();
        app.getContactHelper().fillBaseInformation(new ContactData("Mike", "Green", "nicc", "Jn", "Petrozavodsk", "1111999", "8921194455","dfdfn@gmail.com", "ssstr.ru", "6", "February", "1990", "4", "hi!"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();

    }
}
