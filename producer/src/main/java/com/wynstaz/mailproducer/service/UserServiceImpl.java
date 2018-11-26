package com.wynstaz.mailproducer.service;

import com.wynstaz.mail.core.entity.domain.User;
import com.wynstaz.mail.core.mapper.UserMapper;
import com.wynstaz.mail.core.service.UserService;
import com.wynstaz.mail.core.entity.viewobject.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author: wyn
 * @Date: 2018/11/13 16:55
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Result add(User user) {
        int result = userMapper.insert(user);
        if (result == 1){
            return Result.success();
        } else {
            return Result.failure();
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete(Long id) {
        int result = userMapper.delete(id);
        return result == 1;
    }

    @Override
    public boolean update(User user) {
        int result = userMapper.update(user);
        return result == 1;
    }

}
