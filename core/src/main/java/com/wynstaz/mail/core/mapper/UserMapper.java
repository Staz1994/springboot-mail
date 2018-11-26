package com.wynstaz.mail.core.mapper;

import com.wynstaz.mail.core.entity.domain.User;

import java.util.List;

/**
 * TODO
 *
 * @author: wyn
 * @Date: 2018/11/14 16:28
 */
public interface UserMapper {

    int insert(User user);

    int delete(Long id);

    int update(User entity);

    List<User> findAll();

}
