package rop;

import rop.response.RopResponse;

/**
 *    通过该适配器以统一的方式调用ROP方法
 */
public interface ServiceMethodAdapter {
    /**
     * 调用服务方法
     *
     * @param ropRequestContext
     * @return
     */
    RopResponse invokeServiceMethod(RopRequestContext ropRequestContext);

}

