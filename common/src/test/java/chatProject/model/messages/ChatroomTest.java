package chatProject.model.messages;

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

    @Test
    public void addMessage() {
        List<Message> listMessage = new ArrayList<Message>();
        Chatroom chatroom = new Chatroom(null, null, listMessage);
        chatroom.addMessage(null, "TEST");
        Message message = new Message(0, null, "TEST");

        assertEquals("The new messages must be the one set in addMessage",
                message.toString(), chatroom.getCurrentMessages().get(chatroom.getCurrentMessages().size() - 1).toString());
    }

}
