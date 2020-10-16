package chatProject.model.user;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class UserInfoTest {

    @Test
    public void testGetAccount() {
        final UserAccount user = new UserAccount(0, "My user1");
        final UserInfo userinfo = new UserInfo(user, Status.ACTIVE);

        assertEquals("The UserAccount should be the one set in the constructor",
                user, userinfo.getAccount());
    }

    @Test
    public void testGetCurrentStatus() {
        Status status = Status.ACTIVE;
        final UserAccount user = new UserAccount(0, "My user1");
        final UserInfo userinfo = new UserInfo(user, status);

        assertEquals("The status should be the one set in the constructor",
                status, userinfo.getCurrentStatus());
    }

    @Test
    public void testSetCurrentStatus() {

        Status status = Status.ACTIVE;
        final UserAccount user = new UserAccount(0, "My user1");
        final UserInfo userinfo = new UserInfo(user, status);

        Status newStatus = Status.INACTIVE;
        userinfo.setCurrentStatus(newStatus);

        assertEquals("The status should be the updated when set",
                newStatus, userinfo.getCurrentStatus());
    }

    @Test
    public void testToString() {

        Status status = Status.ACTIVE;
        final UserAccount user = new UserAccount(0, "My user1");
        final UserInfo userinfo = new UserInfo(user, status);
        String string = "My user1(active)";

        assertEquals("The string should be equals to the format",
                string, userinfo.toString());
    }

    @Test
    public void testEquals1() {

        Status status = Status.ACTIVE;
        final UserAccount user1 = new UserAccount(0, "My user");
        final UserInfo userinfo = new UserInfo(user1, status);

        final UserAccount user2 = new UserAccount(0, "My user");
        final UserInfo userinfo2 = new UserInfo(user2, status);

        assertTrue("The account should be equals",
                userinfo.equals(userinfo2));
    }

    @Test
    public void testEquals2() {

        Status status = Status.ACTIVE;
        final UserAccount user1 = new UserAccount(1, "My user");
        final UserInfo userinfo = new UserInfo(user1, status);

        final UserAccount user2 = new UserAccount(2, "My user");
        final UserInfo userinfo2 = new UserInfo(user2, status);

        assertFalse("The account should not be equals cause of account id",
                userinfo.equals(userinfo2));
    }

    @Test
    public void testEquals3() {

        Status status1 = Status.ACTIVE;
        final UserAccount user1 = new UserAccount(0, "My user");
        final UserInfo userinfo = new UserInfo(user1, status1);

        Status status2 = Status.INACTIVE;
        final UserAccount user2 = new UserAccount(0, "My user");
        final UserInfo userinfo2 = new UserInfo(user2, status2);

        assertFalse("The account should not be equals cause of status",
                userinfo.equals(userinfo2));
    }

    @Test
    public void testHashCode() {

        Status status = Status.ACTIVE;
        final UserAccount user = new UserAccount(0, "My user1");
        final UserInfo userinfo = new UserInfo(user, status);

        int hashedUser = Objects.hash(user);

        assertEquals("The username should be the one set in the constructor",
                hashedUser, userinfo.hashCode());
    }
}