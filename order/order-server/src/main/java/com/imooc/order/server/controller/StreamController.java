package com.imooc.order.server.controller;

import com.imooc.order.server.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/send")
    public void send() {
        System.out.println("jhhhh");
        streamClient.output().send(MessageBuilder.withPayload("hahahahha").build());
    }
}
