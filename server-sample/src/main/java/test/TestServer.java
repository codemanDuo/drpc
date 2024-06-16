package test;

import api.HelloService;
import core.registry.DefaultServiceRegistry;
import core.registry.ServiceRegistry;
import core.socket.server.SocketServer;



public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        SocketServer rpcServer = new SocketServer(serviceRegistry);
        rpcServer.start(9000);
    }
}
