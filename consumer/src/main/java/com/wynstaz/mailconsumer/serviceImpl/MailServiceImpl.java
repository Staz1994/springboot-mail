package com.wynstaz.mailconsumer.serviceImpl;

import com.wynstaz.mail.core.exception.ServiceException;
import com.wynstaz.mail.core.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("mailService")
public class MailServiceImpl implements MailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailServiceImpl.class);

    @Resource
    private JavaMailSender mailSender;

    @Override
    public void send(String deliver, String[] receiver, String[] carbonCopy, String subject, String content) throws ServiceException {
        deliver = "377833645@qq.com";
        receiver = new String[]{"wynstaz@gmail.com"};
        carbonCopy = new String[]{};
        subject = "TEST MAIL SEND";
        content = "this is a test mailconsumer, please ignore it.";
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(deliver);
            message.setTo(receiver);
            message.setCc(carbonCopy);
            message.setSubject(subject);
            message.setText(content);
            mailSender.send(message);
        }catch (Exception e){
            LOGGER.error("发送邮件失败",e);
            throw new ServiceException(e.getMessage());
        }
    }
}
