package com.j.dubbo.common.user;

import com.j.dubbo.api.user.IUser;

/**
 * Created by jerry on 3/11/18.
 */
public class UserImpl implements IUser {

    public <T> T getUserInfo(String userIds) {
        System.out.println("getUserInfo");
        return (T)"sdfsdfsf";
    }

    public <T> T updateUserInfo(T userInfo) {
        System.out.println("updateUserInfo");
        return null;
    }
}
