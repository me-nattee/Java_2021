package ru.autoqa.Java2021.addressbook.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;
import java.util.Objects;
@XStreamAlias("contact")
@Entity
@Table(name="addressbook")


public class ContactData {
    @XStreamOmitField
    @Id
    @Column(name="id")
    private int id = Integer.MAX_VALUE;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="nickname")
    private String nickname;

    @Column(name="title")
    private String title;

    @Column(name="address")
    @Type(type="text")
    private String address;

    @Column(name="home")
    @Type(type="text")
    private String homenumber;

    @Column(name="mobile")
    @Type(type="text")
    private String mobile;

    @Column(name="email")
    @Type(type="text")
    private String email;

    @Column(name="email2")
    @Type(type="text")
    private String email2;

    @Column(name="email3")
    @Type(type="text")
    private String email3;

    @Column(name="homepage")
    @Type(type="text")
    private String homepage;

    @Transient
    private String bday;

    @Transient
    private String bmonth;

    @Transient
    private String byear;

    @Transient
    private String aday;

    @Column(name="notes")
    @Type(type="text")
    private String notes;

    @Transient
    private String group;

    @Transient
    private String allPhones;

    @Transient
    private String allEmails;

    @Column(name="photo")
    @Type(type="text")
    private String photo;

    public String getAllEmails() {
        return allEmails;
    }

    public String getAllPhones() {
        return allPhones;
    }

    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(nickname, that.nickname) && Objects.equals(title, that.title) && Objects.equals(address, that.address) && Objects.equals(homenumber, that.homenumber) && Objects.equals(mobile, that.mobile) && Objects.equals(email, that.email) && Objects.equals(email2, that.email2) && Objects.equals(email3, that.email3) && Objects.equals(homepage, that.homepage) && Objects.equals(bday, that.bday) && Objects.equals(bmonth, that.bmonth) && Objects.equals(byear, that.byear) && Objects.equals(aday, that.aday) && Objects.equals(notes, that.notes) && Objects.equals(group, that.group) && Objects.equals(allPhones, that.allPhones) && Objects.equals(allEmails, that.allEmails) && Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, nickname, title, address, homenumber, mobile, email, email2, email3, homepage, bday, bmonth, byear, aday, notes, group, allPhones, allEmails, photo);
    }

    public File getPhoto() {
        return new File(photo);
    }

    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    public ContactData withAllEmails(String allEmails) {
        this.allEmails = allEmails;
        return this;
    }


    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getNickname() {
        return nickname;
    }
    public String getTitle() {
        return title;
    }
    public String getAddress() {
        return address;
    }
    public String getHomenumber() {
        return homenumber;
    }
    public String getMobile() {
        return mobile;
    }
    public String getEmail() {
        return email;
    }
    public String getEmail2() {
        return email2;
    }
    public String getEmail3() {
        return email3;
    }
    public String getHomepage() {
        return homepage;
    }
    public String getBday() {
        return bday;
    }
    public String getBmonth() {
        return bmonth;
    }
    public String getByear() {
        return byear;
    }
    public String getAday() {
        return aday;
    }
    public String getNotes() {
        return notes;
    }
    public String getGroup() {
        return group;
    }


    public int getId() {
        return id;
    }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }

    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public ContactData withTitle(String title) {
        this.title = title;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData withHomenumber(String homenumber) {
        this.homenumber = homenumber;
        return this;
    }

    public ContactData withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactData withEmail2(String email2) {
        this.email2 = email2;
        return this;
    }
    public ContactData withEmail3(String email3) {
        this.email3 = email3;
        return this;
    }

    public ContactData withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public ContactData withBday(String bday) {
        this.bday = bday;
        return this;
    }

    public ContactData withBmonth(String bmonth) {
        this.bmonth = bmonth;
        return this;
    }

    public ContactData withByear(String byear) {
        this.byear = byear;
        return this;
    }

    public ContactData withAday(String aday) {
        this.aday = aday;
        return this;
    }

    public ContactData withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }
    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

}
