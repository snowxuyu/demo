package org.snow.sys.service.impl;

import org.framework.basic.service.impl.BaseServiceImpl;
import org.snow.sys.dao.UserDao;
import org.snow.sys.entity.User;
import org.snow.sys.servce.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by snow on 2015/8/20.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    private UserDao userDao;

    public User queryBitById(String id) {
        return userDao.queryBitById(id);
    }

    public User queryById(String id) {
        return userDao.queryById(id);
    }
}
