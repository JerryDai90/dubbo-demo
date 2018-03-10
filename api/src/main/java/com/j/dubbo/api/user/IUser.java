package com.j.dubbo.api.user;

/**
 * Created by jerry on 3/11/18.
 */
public interface IUser {

    <T> T getUserInfo(String userIds);

    <T> T updateUserInfo(T userInfo);

}
