package rop.session;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public interface Session extends Serializable {

    /**
     * 设置属性
     * @param name
     * @param obj
     */
    void setAttribute(String name, Object obj);

    /**
     * 获取属性
     * @param name
     * @return
     */
    Object getAttribute(String name);

    Map<String, Object> getAttributes();

    void setAttributes(Map<String,Object> map);

}