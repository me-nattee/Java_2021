package ru.autoqa.Java2021.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.appmanager.ContactHelper;
import ru.autoqa.Java2021.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactDeletingTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (app.contact().list().size() == 0) {
            app.contact().create(new ContactData().withFirstname("Mary").withLastname("Brown").withNickname("mar").withTitle("Jn").withAddress("Petrozavodsk").withHomenumber("335999").withMobile("8923294455").withEmail("dfdfn@gmail.com").withHomepage("ssstr.ru").withBday("6").withBmonth("February").withByear("1990").withAday("-").withGroup("Test1").withNotes("hi!"));
        }
    }

    @Test
    public void testContactDeleting() {
        app.goTo().homePage();
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(index);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(after, before);
        }

}
