package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletingTests extends TestBase {

    @Test
    public void testContactDeleting() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().closeAlert();
        app.getContactHelper().returnToHomePage();

    }
}
