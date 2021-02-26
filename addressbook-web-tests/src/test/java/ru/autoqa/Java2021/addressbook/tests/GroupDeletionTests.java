package ru.autoqa.Java2021.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.GroupData;
import java.util.Set;

public class GroupDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().groupPage();
    if (app.group().all().size() == 0){
      app.group().create(new GroupData().withName("Test1"));
    }
  }
  @Test
  public void testGroupDeletion() {
    Set<GroupData> before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size(), before.size() - 1);
//    app.getNavigationHelper().returnToHomePage();

    before.remove(deletedGroup);
    Assert.assertEquals(before, after);
    }

}


