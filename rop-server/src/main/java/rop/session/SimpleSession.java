package rop.session;

import java.util.HashMap;
import java.util.Map;

public class SimpleSession implements Session {

    private Map<String, Object> attributes = new HashMap<String, Object>();

    public void setAttribute(String name, Object obj) {
        attributes.put(name, obj);
    }

    public Object getAttribute(String name) {
        return attributes.get(name);
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }
    @Override
    public void setAttributes(Map<String, Object> map) {
        attributes.clear();
        this.attributes=map;
    }
}

