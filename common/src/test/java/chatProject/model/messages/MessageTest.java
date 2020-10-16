package chatProject.model.messages;

import chatProject.model.user.Status;
import chatProject.model.user.UserAccount;
import chatProject.model.user.UserInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void getId() {
        int id = 42;
        final Message<Object> message = new Message<>(id, null, null);

        assertEquals("The message ID is not the one set in the constructor",
                id, message.getId());
    }

    @Test
    public void getMessage() {
        String content = "TEST";
        final Message<String> message = new Message<>(0, null, content);

        assertEquals("The message content is not the one set in the constructor",
                content, message.getMessage());
    }

    @Test
    public void getSender() {
        UserInfo sender = new UserInfo(new UserAccount(0, "test"), Status.ACTIVE);
        sender = new UserInfo(sender.getAccount(), sender.getCurrentStatus());
        final Message<Object> message = new Message<>(0, sender, null);

        assertEquals("The sender is not the one set in the constructor",
                sender, message.getSender());
    }
}