package com.nettyrpc.protocol;

import lombok.Getter;
import lombok.Setter;

/**
 * RPC Request
 * @author huangyong
 * @author tao.shi
 */
@Getter
@Setter
public class RpcRequest {
    private String requestId;
    private String className;
    private String methodName;
    private Class<?>[] parameterTypes;
    private Object[] parameters;

}