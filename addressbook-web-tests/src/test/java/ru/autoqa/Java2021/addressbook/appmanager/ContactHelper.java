package ru.autoqa.Java2021.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.autoqa.Java2021.addressbook.model.ContactData;
import ru.autoqa.Java2021.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends BaseHelper {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }
//    public void returnToHomePage() {
//        click(By.linkText("home"));
//    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillBaseInformation(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomenumber());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
        type(By.name("homepage"), contactData.getHomepage());

        select(By.name("bday"),contactData.getBday());
        select(By.name("bmonth"),contactData.getBmonth());

        type(By.name("byear"), contactData.getByear());
        select(By.name("aday"),contactData.getAday());

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

        type(By.name("notes"), contactData.getNotes());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void selectContact(int index) {
        wd.findElements(By.xpath("(//input[@name='selected[]'])")).get(index).click();
//        click(By.xpath("(//input[@name='selected[]'])"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void closeAlert() {
        wd.switchTo().alert().accept();
    }

    public void editContact(int index) {
        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
//        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillBaseInformation(contact, true);
        submitContactCreation();
    }

    public void modifyContact(int index, ContactData contact) {
        editContact(index);
        fillBaseInformation(contact, false);
        submitContactModification();
        returnToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("(//input[@name='selected[]'])"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> rows = wd.findElements(By.cssSelector("tr[name='entry']"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            int id = Integer.parseInt(row.findElement(By.tagName("input")).getAttribute("value"));
            String firstname = cells.get(2).getText();
            String lastname = cells.get(1).getText();
            ContactData contact = new ContactData(id, firstname, lastname,null, null,null,null,null,null,null,null,null,null,null,null,null);
            contacts.add(contact);
        }
        return contacts;

    }
    public void returnToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home"));
    }

}
