package ru.autoqa.Java2021.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
