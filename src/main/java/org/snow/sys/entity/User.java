package org.snow.sys.entity;

import lombok.Data;
import org.framework.basic.entity.BaseEntity;

import javax.persistence.Table;

/**
 * Created by snow on 2015/8/20.
 */
@Table(name="t_user")
@Data
public class User extends BaseEntity {

    private String userName;
    private String passWord;
    private String  phone;
    private String address;

}
