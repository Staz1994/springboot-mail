package com.wynstaz.demo01.service;

import com.wynstaz.demo01.exception.ServiceException;

public interface MailService {

    /**
     * 发送邮件
     *
     * @param deliver    发送人
     * @param receiver   接收人
     * @param carbonCopy 抄送人
     * @param subject    主题
     * @param content    内容
     */
    void send(String deliver, String[] receiver, String[] carbonCopy, String subject, String content) throws ServiceException;
}
