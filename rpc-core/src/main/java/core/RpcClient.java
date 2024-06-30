package core;

import common.entity.RpcRequest;
import core.serializer.CommonSerializer;

public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

//    void setSerializer(CommonSerializer serializer);
}
