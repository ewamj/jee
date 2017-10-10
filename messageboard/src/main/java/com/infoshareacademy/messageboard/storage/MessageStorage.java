package com.infoshareacademy.messageboard.storage;

import com.infoshareacademy.messageboard.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageStorage {
    private List<Message> messages = new ArrayList<>();

    public void add(Message message) {
        messages.add(message);
    }

    public List<Message> getAll() {
        return this.messages;
    }
}
