package com.transwarp.demo.dmo;

import java.io.Serializable;

/**
 * Created by huangnx on 2018/8/23.
 */
public class UserInfo implements Serializable {

    private String  userName;

    private String  psw;

    private String  realName;

    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
