package com.wynstaz.demo01.web;

import com.wynstaz.demo01.exception.ServiceException;
import com.wynstaz.demo01.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MailController {

    @Resource
    private MailService mailService;

    @RequestMapping(value = "/mail/addPage", method = RequestMethod.GET)
    public String mailPage() {
        return "addMailPage";
    }

    @RequestMapping(value = "/mail/add")
    @ResponseBody
    public String addMail(String deliver, String[] receiver, String[] carbonCopy, String subject, String content) {
        try {
            mailService.send(deliver, receiver, carbonCopy, subject, content);
        } catch (ServiceException e) {
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }


}
