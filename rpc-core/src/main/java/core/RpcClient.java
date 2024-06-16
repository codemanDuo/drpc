package core;

import common.entity.RpcRequest;

public interface RpcClient {

    Object sendRequest(RpcRequest rpcRequest);
}
