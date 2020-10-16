package chatProject.model.user;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class UserAccountTest {

    @Test
    public void getUsername() {

        final String username = "My user";
        final UserAccount user = new UserAccount(0, username);

        assertEquals("The username should be the one set in the constructor",
                username, user.getUsername());
    }

    @Test
    public void testEquals() {

        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserAccount user2 = new UserAccount(1, "MyUser2");

        assertTrue("2 accounts are equal if they have the same id",
                user1.equals(user2));
    }

    @Test
    public void testHashCode() {

        final UserAccount user1 = new UserAccount(1, "MyUser1");
        final UserAccount user2 = new UserAccount(2, "MyUser1");
        int hashUser = Objects.hash(user2.getUsername());

        assertEquals("2 accounts with the same username should have the same hashcode",
                user1.hashCode(), hashUser);
    }

    @Test
    public void testToString() {

        final UserAccount user = new UserAccount(0, "MyUser");
        assertEquals("The toString() method of a UserAccount should print the username",
                "MyUser", user.toString());
    }

    @Test
    public void testGetId() {

        final UserAccount user = new UserAccount(0, "MyUser");
        assertEquals("The id should be the one set in the constructor",
                0, user.getId());
    }
}