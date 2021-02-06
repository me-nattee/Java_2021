package ru.autoqa.Java2021.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreationNewContact() throws Exception {
        initContactCreation();
        fillBaseInformation(new ContactData("Maria", "-", "Ivanova", "Mary", "Jn", "Valamis", "Petrozavodsk"));
        fillPhones(new PhonesData("999999", "89113334455", "8889999", "888987"));
        fillOtherInformation(new SecondaryData("me.n@gmail.com", "-", "-", "-", "2", "February", "1990", "-", "-", "-", "hi!"));
        submitContactCreation();
        returnToHomePage();
    }

}
