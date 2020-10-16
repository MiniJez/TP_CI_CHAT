package chatProject.model.messages;

import chatProject.model.user.Status;
import chatProject.model.user.UserAccount;
import chatProject.model.user.UserInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChatroomTest {

    @Test
    public void getName() {
        String name = "TEST";
        Chatroom chatroom = new Chatroom(name, null, null);

        assertEquals("The message name is not the one set in the constructor",
                name, chatroom.getName());
    }

    @Test
    public void getCurrentMessage() {
        List<Message> listMessage = new ArrayList<Message>();
        listMessage.add(new Message(0, null, "TEST"));
        listMessage.add(new Message(1, null, "TEST 2"));

        Chatroom chatroom = new Chatroom(null, null, listMessage);

        assertEquals("The list of messages must be the one set in the constructor",
                listMessage, chatroom.getCurrentMessages());
    }

}
