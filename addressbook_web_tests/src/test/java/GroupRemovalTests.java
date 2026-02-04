import model.Group;
import org.junit.jupiter.api.Test;

public class GroupRemovalTests extends TestBase {

    @Test
    public void canRemoveGroup() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup(new Group("group name to delete", "group header to delete", "group footer to delete"));
        }
        removeGroup();
    }
}