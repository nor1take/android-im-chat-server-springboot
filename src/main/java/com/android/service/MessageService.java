package com.android.service;

import com.android.pojo.Message;

import java.util.List;

public interface MessageService {
    boolean add(Message message);

    List<String> selectAllChatGroup(int uid);

    List<Message> selectAllMessage(String chatGroup);
}
