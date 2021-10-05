package com.nibblebytes.aopprogramming.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String receiveMessage(String message) {
        System.out.println("Method receive message1 param: " + message);
        return message;
    }
}
