package com.j.dubbo.api.auth;

import java.util.Map;

/**
 * Created by jerry on 3/11/18.
 */
public interface IPermission {

    Map<String, String> getRolePermission(String roleId);

    void setRolePermission(Map<String, String> rolePermission);

}
