package com.wynstaz.mail.core.service;

import com.wynstaz.mail.core.entity.domain.User;
import com.wynstaz.mail.core.entity.viewobject.Result;

/**
 * TODO
 *
 * @author: wyn
 * @Date: 2018/11/13 16:53
 */
public interface UserService {
    /**
     * 添加用户
     * @return
     */
    Result add(User user);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Long id);

    /**
     * 更新
     * @param user
     * @return
     */
    boolean update(User user);
}
