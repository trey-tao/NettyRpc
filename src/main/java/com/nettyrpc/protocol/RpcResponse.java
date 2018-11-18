package com.nettyrpc.protocol;

import lombok.Getter;
import lombok.Setter;

/**
 * RPC Response
 * @author huangyong
 * @author tao.shi
 */
@Getter
@Setter
public class RpcResponse {
    private String requestId;
    private String error;
    private Object result;

    public boolean isError() {
        return error != null;
    }

}
