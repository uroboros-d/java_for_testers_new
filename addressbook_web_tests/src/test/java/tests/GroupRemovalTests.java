package tests;

import model.Group;
import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase {

    @Test
    public void canRemoveGroup() {
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup(new Group("group name to delete", "group header to delete", "group footer to delete"));
        }
        app.groups().removeGroup();
    }
}