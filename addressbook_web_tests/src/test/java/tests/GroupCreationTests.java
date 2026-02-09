package tests;

import model.Group;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GroupCreationTests extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"group name", "group name'"})
    public void canCreateGroup(String name) {
        int groupCount = app.groups().getCount();
        app.groups().createGroup(new Group(name, "group header", "group footer"));
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount+1, newGroupCount);
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        app.groups().createGroup(new Group());
    }

    @Test
    public void canCreateGroupWithNameOnly() {
        app.groups().createGroup(new Group().withName("group name only"));
    }

    @Test
    public void canCreateMultipleGroups() {
        int n = 5;
        int groupCount = app.groups().getCount();
        for (int i = 0; i < n; i++) {
            app.groups().createGroup(new Group(randomString(i),
                    "group header", "group footer"));
        }
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount+n, newGroupCount);
    }
}
