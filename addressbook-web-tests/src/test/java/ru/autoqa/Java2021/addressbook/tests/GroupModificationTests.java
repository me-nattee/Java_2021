package ru.autoqa.Java2021.addressbook.tests;

import org.testng.annotations.Test;
import ru.autoqa.Java2021.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    }
}
