package org.snow.sys.dao;

import org.framework.basic.dao.BaseDao;
import org.snow.sys.entity.User;

import java.util.List;

/**
 * Created by snow on 2015/8/20.
 */
public interface UserDao extends BaseDao<User> {
    User queryBitById(String id);
    User queryById(String id);

    List<User> selectAll();
}
