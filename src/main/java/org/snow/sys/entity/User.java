package org.snow.sys.entity;

import org.framework.basic.entity.BaseEntity;

import javax.persistence.Table;

/**
 * Created by snow on 2015/8/20.
 */
@Table(name="t_user")
public class User extends BaseEntity {

    private String userName;
    private String passWord;
    private Integer phone;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='"+super.getId()+'\''+
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}
