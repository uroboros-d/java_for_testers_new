import model.Group;
import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase {

    @Test
    public void canRemoveGroup() {
        app.openGroupsPage();
        if (!app.isGroupPresent()) {
            app.createGroup(new Group("group name to delete", "group header to delete", "group footer to delete"));
        }
        app.removeGroup();
    }
}