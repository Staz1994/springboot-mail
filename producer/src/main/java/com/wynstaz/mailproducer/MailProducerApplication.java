package com.wynstaz.mailproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wynstaz.mail.core.mapper")
public class MailProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailProducerApplication.class, args);
    }
}
