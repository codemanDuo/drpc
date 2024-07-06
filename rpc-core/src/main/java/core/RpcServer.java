package core;

import core.serializer.CommonSerializer;

public interface RpcServer {

    void start();

//    void setSerializer(CommonSerializer serializer);

    <T> void publishService(T service, String serviceName);
    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;


}