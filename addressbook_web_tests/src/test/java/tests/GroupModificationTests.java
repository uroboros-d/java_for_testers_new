package tests;

import model.Group;
import org.junit.jupiter.api.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void canModifyGroup() {
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup(new Group("ModifyGroup name", "ModifyGroup header", "ModifyGroup footer"));
        }
        app.groups().modifyGroup(new Group().withName("modified name"));
    }
}
