package test;

import api.HelloService;
import core.netty.server.NettyServer;
import core.registry.DefaultServiceRegistry;
import core.registry.ServiceRegistry;

public class NettyTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }

}
