package org.snow.sys.servce;

import org.framework.basic.service.BaseService;
import org.snow.sys.entity.User;

/**
 * Created by snow on 2015/8/20.
 */
public interface UserService extends BaseService<User> {

    User queryBitById(String id);

    User queryById(String id);
}
