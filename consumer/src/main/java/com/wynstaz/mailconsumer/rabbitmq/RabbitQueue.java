package com.wynstaz.mailconsumer.rabbitmq;


import com.wynstaz.mail.core.rabbitmq.RabbitMQConstant;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitQueue {


//    @Bean
//    public Queue testQueue() {
//        return new Queue(RabbitMQConstant.QUEUE_NAME_TEST);
//    }


    @Bean
    public Queue mailQueue(){
        return new Queue(RabbitMQConstant.QUEUE_NAME_MAIL);
    }
}
