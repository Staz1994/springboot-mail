package com.wynstaz.mailconsumer;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class MailConsumerApplicationTests {

//    @Autowired
    private JavaMailSender javaMailSender;

    @Value("aaa")
    private String test;
    @Test
    public void contextLoads() {
        System.out.println(test);

//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("377833645@qq.com");
//        message.setTo("377833645@qq.com");
//        message.setSubject("主题：简单邮件");
//        message.setText("测试邮件内容");
//
//        javaMailSender.send(message);

    }
}
