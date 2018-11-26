package com.wynstaz.mailproducer.web;


import com.wynstaz.mail.core.entity.domain.User;
import com.wynstaz.mail.core.entity.viewobject.Result;
import com.wynstaz.mail.core.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author: wyn
 * @Date: 2018/11/13 14:05
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 获取资源
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result get(){
        return Result.success();
    }

    /**
     * 新建资源
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(final User user){
        userService.add(user);
        return Result.success(user);
    }

    /**
     * 更新资源
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Result put(final User user){
        return Result.build(userService.update(user), null);
    }

    /**
     * 删除资源
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Result delete(final User user){
        return Result.build(userService.delete(user.getId()), null);
    }

}
