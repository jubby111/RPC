package org.jubby.provider;

import org.jubby.common.service.UserSeivice;
import org.jubby.minirpc.registry.LocalRegistry;
import org.jubby.minirpc.service.HttpServer;
import org.jubby.minirpc.service.VertxHttpServer;

public class EasyProvicerExample {
    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserSeivice.class.getName(),
                UserServiceImpl.class);

        //启动web服务
        HttpServer hettpserver = new VertxHttpServer();
        hettpserver.doStart(8080);
    }
}
