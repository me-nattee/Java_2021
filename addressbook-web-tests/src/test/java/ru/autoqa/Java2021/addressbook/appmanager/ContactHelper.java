package ru.autoqa.Java2021.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import ru.autoqa.Java2021.addressbook.model.PhonesData;
import ru.autoqa.Java2021.addressbook.model.SecondaryData;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }
    public void returnToHomePage() {
        click(By.linkText("home"));
    }

    public void submitContactCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillOtherInformation(SecondaryData secondaryData) {
        type(By.name("email"), secondaryData.getEmail());
        type(By.name("email2"), secondaryData.getEmail2());
        type(By.name("email3"), secondaryData.getEmail3());
        type(By.name("homepage"), secondaryData.getHomepage());

        select(By.name("bday"),secondaryData.getBday());
        select(By.name("bmonth"),secondaryData.getBmonth());

        type(By.name("byear"), secondaryData.getByear());
        select(By.name("aday"),secondaryData.getAday());

        click(By.name("new_group"));
        type(By.name("address2"), secondaryData.getAddress2());
        type(By.name("phone2"), secondaryData.getPhone2());
        type(By.name("notes"), secondaryData.getNotes());
    }

    public void fillPhones(PhonesData phonesData) {
        type(By.name("home"), phonesData.getHomenumber());
        type(By.name("mobile"), phonesData.getMobile());
        type(By.name("work"), phonesData.getWorknumber());
        type(By.name("fax"), phonesData.getFax());
    }

    public void fillBaseInformation(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());

    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }
}
