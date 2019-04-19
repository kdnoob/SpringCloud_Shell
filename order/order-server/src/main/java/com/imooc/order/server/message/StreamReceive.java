package com.imooc.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceive {
//
//    @StreamListener(value = StreamClient.INPUT)
//    public void receive(Object msg) {
//        System.out.println(msg);
//        log.info("streamReceive :{}", msg);
//    }



}
