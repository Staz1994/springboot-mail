package com.wynstaz.mail.web;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author: wyn
 * @Date: 2018/11/13 14:05
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/list")
    public Object getR(){
        Map restlt = new HashMap();
        restlt.put("11", 11);
        return restlt;
    }
}
