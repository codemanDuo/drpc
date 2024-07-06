package test;


import core.RpcServer;
import core.serializer.CommonSerializer;
import core.socket.server.SocketServer;

public class TestServer {

    public static void main(String[] args) {
//        HelloService helloService = new HelloServiceImpl();
//        ServiceProvider serviceProvider = new DefaultServiceProvider();
//        serviceProvider.register(helloService);
//        SocketServer rpcServer = new SocketServer(serviceProvider);
//        rpcServer.start(9000);

        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }
}
