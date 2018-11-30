package com.wynstaz.mailproducer.rabbitmq;


import com.wynstaz.mail.core.rabbitmq.RabbitMQConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Sender {

    private static Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Resource
    private AmqpTemplate rabbitTemplate;


    public void send() {
        String context = "test " + System.currentTimeMillis();
        LOGGER.info("Sender.context:{}", context);
        this.rabbitTemplate.convertAndSend(RabbitMQConstant.QUEUE_NAME_TEST, context);
    }

}
