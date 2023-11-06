package com.android.service;


import com.android.pojo.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class MessageServiceTest {
    @Autowired
    private MessageService messageService;

    @Test
    public void testGetAllMessages() {
        List<Message> messageList = messageService.selectAllMessage(
                "{\"from\":\"3用户\",\"message\":\"...\",\"postId\":25,\"to\":\"6用户\"}"
        );
        System.out.println(messageList);
    }

    @Test
    public void testSendMsg() {
        Message message1 = new Message(
                null,
                3,
                "message ... ",
                6,
                new Date(),
                3,
                "{\"from\":\"3用户\",\"message\":\"...\",\"postId\":25,\"to\":\"6用户\"}"
        );

        messageService.add(message1);
    }

}
