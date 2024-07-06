package test;

import api.ByeService;
import api.HelloObject;
import api.HelloService;
import core.RpcClient;
import core.RpcClientProxy;
import core.netty.client.NettyClient;
import core.serializer.CommonSerializer;
import core.serializer.KryoSerializer;
import core.serializer.ProtobufSerializer;

public class NettyTestClient {

    public static void main(String[] args) {
//        RpcClient client = new NettyClient("127.0.0.1", 9999);
//        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
//        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
//        HelloObject object = new HelloObject(12, "This is a message");
//        String res = helloService.hello(object);
//        System.out.println(res);


//        RpcClient client = new NettyClient();
//        client.setSerializer(new KryoSerializer());
//        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
//        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
//        HelloObject object = new HelloObject(12, "This is a message");
//        String res = helloService.hello(object);
//        System.out.println(res);

//        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
//        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
//        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
//        HelloObject object = new HelloObject(12, "This is a message");
//        String res = helloService.hello(object);
//        System.out.println(res);

        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));


    }

}