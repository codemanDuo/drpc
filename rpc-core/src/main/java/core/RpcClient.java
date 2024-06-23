package core;

import common.entity.RpcRequest;
import core.serializer.CommonSerializer;

public interface RpcClient {

    Object sendRequest(RpcRequest rpcRequest);

    void setSerializer(CommonSerializer serializer);
}
