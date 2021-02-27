package ru.autoqa.Java2021.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void testCreationNewContact() throws Exception {
        app.goTo().homePage();
        List<ContactData> before = app.contact().list();
        ContactData contact = new ContactData().withFirstname("Mary").withLastname("Brown").withNickname("mar").withTitle("Jn").withAddress("Petrozavodsk").withHomenumber("335999").withMobile("8923294455").withEmail("dfdfn@gmail.com").withHomepage("ssstr.ru").withBday("6").withBmonth("February").withByear("1990").withAday("-").withGroup("Test1").withNotes("hi!");
        app.contact().create(contact);
        app.goTo().homePage();
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() + 1);


        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(after, before);
    }

}
