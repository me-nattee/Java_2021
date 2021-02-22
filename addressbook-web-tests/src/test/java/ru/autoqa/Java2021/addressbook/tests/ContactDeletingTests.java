package ru.autoqa.Java2021.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;

public class ContactDeletingTests extends TestBase {

    @Test
    public void testContactDeleting() {
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact((new ContactData("Rita", "Black", "rita", "Jn", "Petrozavodsk", "335999", "8923294455","dfdfn@gmail.com", "ssstr.ru", "6", "February", "1990", "-", "Test1","hi!")));
        }
        app.getNavigationHelper().returnToHomePage();
        app.getContactHelper().selectContact(0);
        app.getContactHelper().deleteContact();
        app.getContactHelper().closeAlert();
        app.getNavigationHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        if (before == 0) {
            Assert.assertEquals(after, before);
        } else {
            Assert.assertEquals(after, before - 1);
        }
    }
}
