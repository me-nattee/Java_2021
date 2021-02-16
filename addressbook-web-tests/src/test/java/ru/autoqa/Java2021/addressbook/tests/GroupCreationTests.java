package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.*;
import ru.autoqa.Java2021.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
  }

}
