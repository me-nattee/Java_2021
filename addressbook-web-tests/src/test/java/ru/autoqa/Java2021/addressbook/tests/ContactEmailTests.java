package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactEmailTests extends TestBase{
    @Test
    public void testContactEmails(){
        app.goTo().homePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getEmail(), equalTo(contactInfoFromEditForm.getEmail()));
        assertThat(contact.getEmail2(), equalTo(contactInfoFromEditForm.getEmail2()));
    }

    public String cleaned (String emails){
        return emails.replaceAll("\\s","");
    }
}