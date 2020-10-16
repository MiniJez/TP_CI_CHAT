package chatProject.model.messages;

import chatProject.model.user.Status;
import chatProject.model.user.UserAccount;
import chatProject.model.user.UserInfo;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class ChatInstanceTest {

    @Test
    public void getCurentChatrooms() {
        List<Chatroom> listChatroom = new ArrayList<Chatroom>();
        listChatroom.add(new Chatroom("TEST", null, null));
        ChatInstance chatinstance = new ChatInstance(listChatroom, null);

        assertEquals("The message name is not the one set in the constructor",
                listChatroom, chatinstance.getCurentChatrooms());
    }

    @Test
    public void addChatroom() {
        List<Chatroom> listChatroom = new ArrayList<Chatroom>();
        Chatroom chatroom = new Chatroom("TEST", null, null);
        ChatInstance chatinstance = new ChatInstance(listChatroom, null);
        chatinstance.addChatroom(chatroom);

        assertEquals("The message name is not the one set in the constructor",
                chatroom, chatinstance.getCurentChatrooms().get(chatinstance.getCurentChatrooms().size() - 1));
    }
}
