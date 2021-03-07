package ru.autoqa.Java2021.addressbook.tests;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import ru.autoqa.Java2021.addressbook.model.Contacts;
import ru.autoqa.Java2021.addressbook.model.GroupData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class ContactCreationTests extends TestBase {

    @DataProvider
    public Iterator<Object[]> validContacts() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        File photo = new File("src/test/resources/stru.jpg");
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.csv")));
        String line = reader.readLine();
        while (line != null){
            String[] split = line.split(";");
            if (split.length !=3){
                continue;
            }
            list.add(new Object[] {new ContactData().withLastname(split[0]).withFirstname(split[1]).withAddress(split[2])});
            line = reader.readLine();
        }
        return list.iterator();
    }

    @Test (dataProvider = "validContacts")
    public void testCreationNewContact(ContactData contact) throws Exception {
        app.goTo().homePage();
        Contacts before = app.contact().all();
        File photo = new File("src/test/resources/stru.jpg");
        app.contact().create(contact);
        app.goTo().homePage();
        MatcherAssert.assertThat(app.contact().count(), equalTo(before.size() + 1));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
    }

    @Test (enabled = false)
    public void testBadCreationNewContact() {
        app.goTo().homePage();
        Contacts before = app.contact().all();
        ContactData contact = new ContactData().withFirstname("Mary'").withLastname("Brown").withNickname("mar").withTitle("Jn").withAddress("Petrozavodsk").withHomenumber("335999").withMobile("8923294455").withEmail("dfdfn@gmail.com").withEmail2("new_second@mail.com").withHomepage("ssstr.ru").withBday("6").withBmonth("February").withByear("1990").withAday("-").withGroup("Test1").withNotes("hi!");
        app.contact().create(contact);
        app.goTo().homePage();
        assertThat(app.contact().count(), equalTo(before.size()));
        Contacts after = app.contact().all();
        assertThat(after, equalTo(before));
    }
    @Test
    public void testCurrentDir() throws Exception {
        File currentDir = new File(".");
        System.out.println(currentDir.getAbsolutePath());
        File photo = new File("src/test/resources/stru.jpg");
        System.out.println(photo.getAbsolutePath());
        System.out.println(photo.exists());
    }

}
