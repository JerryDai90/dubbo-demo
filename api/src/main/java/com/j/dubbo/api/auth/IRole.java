package com.j.dubbo.api.auth;

import java.util.List;

/**
 * Created by jerry on 3/11/18.
 */
public interface IRole {

    <T> List<T> getUserRole();

    void setUserRole(Object obj);

}
