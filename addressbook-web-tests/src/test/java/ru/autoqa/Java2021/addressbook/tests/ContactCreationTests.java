package ru.autoqa.Java2021.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import ru.autoqa.Java2021.addressbook.model.GroupData;

import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreationNewContact() throws Exception {
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createContact(new ContactData("Mary", "Brown", "mar", "Jn", "Petrozavodsk", "335999", "8923294455","dfdfn@gmail.com", "ssstr.ru", "6", "February", "1990", "-", "Test1","hi!"));
        app.getNavigationHelper().returnToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
