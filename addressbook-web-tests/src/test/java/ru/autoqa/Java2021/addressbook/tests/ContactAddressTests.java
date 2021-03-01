package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactAddressTests extends TestBase{

    @Test
    public void testContactAddress(){
        app.goTo().homePage();
        ContactData contact = app.contact().all().iterator().next();
        ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

        assertThat(contact.getAddress(), equalTo(contactInfoFromEditForm.getAddress()));
    }

//    public String cleaned (String addresses){
//        return addresses.replaceAll("\\s","").replaceAll("[-()]]","");
//    }
}
