package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import ru.autoqa.Java2021.addressbook.model.PhonesData;
import ru.autoqa.Java2021.addressbook.model.SecondaryData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreationNewContact() throws Exception {
        app.getGroupHelper().initContactCreation();
        app.getGroupHelper().fillBaseInformation(new ContactData("Katya", "-", "Petrova", "Mary", "Jn", "Valamis", "Petrozavodsk"));
        app.getGroupHelper().fillPhones(new PhonesData("995999", "89143334455", "8889999", "888987"));
        app.getGroupHelper().fillOtherInformation(new SecondaryData("me.n@gmail.com", "-", "-", "-", "2", "February", "1990", "-", "-", "-", "hi!"));
        app.getGroupHelper().submitContactCreation();
        app.getGroupHelper().returnToHomePage();
    }

}
