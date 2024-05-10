package org.jubby.consumer;

import org.jubby.common.model.User;
import org.jubby.common.service.UserSeivice;
import org.jubby.minirpc.proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {
        UserSeivice userSeivice = ServiceProxyFactory.getProxy(UserSeivice.class);
        User user = new User();
        user.setName("jubby");

        User newUser = userSeivice.getUser(user);
        if(newUser != null){
            System.out.println(newUser.getName());
        }else{
            System.out.println("user == null");
        }
    }
}
