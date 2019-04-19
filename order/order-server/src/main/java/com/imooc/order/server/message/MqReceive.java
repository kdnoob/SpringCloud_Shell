package com.imooc.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MqReceive {

    //  手动创建队列  @RabbitListener(queues = "myQueue")
    //  自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void reveive(String msg) {

        log.info("msg={}", msg);
    }
}
