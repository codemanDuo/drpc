package test;

import api.ByeService;
import api.HelloObject;
import api.HelloService;
import core.RpcClient;
import core.RpcClientProxy;
import core.serializer.CommonSerializer;
import core.socket.client.SocketClient;

public class TestClient {

    public static void main(String[] args) {
//        RpcClientProxy proxy = new RpcClientProxy("127.0.0.1", 9000);
//        HelloService helloService = proxy.getProxy(HelloService.class);
//        HelloObject object = new HelloObject(12, "This is a message");
//        String res = helloService.hello(object);
//        System.out.println(res);

//        RpcClient rpcClient = new SocketClient("127.0.0.1",9000);
//        RpcClientProxy proxy = new RpcClientProxy(rpcClient);
//        HelloService helloService = proxy.getProxy(HelloService.class);
//        HelloObject helloObject = new HelloObject(12 , "This is a message");
//        String res = helloService.hello(helloObject);
//        System.out.println(res);

        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }
}
