package com.j.dubbo.common;

import com.j.dubbo.api.auth.IPermission;
import com.j.dubbo.api.auth.IRole;
import com.j.dubbo.api.user.IUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by jerry on 3/11/18.
 */
public class App4Client {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        IUser user = context.getBean(IUser.class);
        user.getUserInfo("hahaha");

        IRole role = context.getBean(IRole.class);
        role.getUserRole();

        IPermission permission = context.getBean(IPermission.class);
        permission.getRolePermission("");

    }

}
