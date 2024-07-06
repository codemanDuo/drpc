package test;

import api.HelloService;
import core.RpcServer;
import core.annotation.ServiceScan;
import core.netty.server.NettyServer;
import core.serializer.CommonSerializer;
import core.serializer.KryoSerializer;
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
//        HelloService helloService = new HelloServiceImpl();
//        ServiceProvider registry = new DefaultServiceProvider();
//        registry.register(helloService);
//        NettyServer server = new NettyServer();
//        server.start(9999);

//        HelloService helloService = new HelloServiceImpl();
//        NettyServer server = new NettyServer("127.0.0.1", 9999);
//        server.setSerializer(new KryoSerializer());
//        server.publishService(helloService,HelloService.class);

//        HelloService helloService = new HelloServiceImpl();
//        NettyServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
//        server.publishService(helloService, HelloService.class);
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
