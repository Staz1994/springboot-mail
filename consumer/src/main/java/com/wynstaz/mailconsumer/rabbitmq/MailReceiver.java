package com.wynstaz.mailconsumer.rabbitmq;


import com.wynstaz.mail.core.rabbitmq.RabbitMQConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MailReceiver {

    private static Logger LOGGER = LoggerFactory.getLogger(MailReceiver.class);

    @RabbitHandler
    @RabbitListener(queues = {RabbitMQConstant.QUEUE_NAME_MAIL, RabbitMQConstant.QUEUE_NAME_MAIL})
    public void process(String context) {
        LOGGER.info("Receiver:{}", context);
    }


}
