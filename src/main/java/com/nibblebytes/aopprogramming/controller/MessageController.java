package com.nibblebytes.aopprogramming.controller;

import com.nibblebytes.aopprogramming.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/message")
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<String> all(@RequestBody String message){
        return ResponseEntity.ok(messageService.receiveMessage(message));
    }

}
