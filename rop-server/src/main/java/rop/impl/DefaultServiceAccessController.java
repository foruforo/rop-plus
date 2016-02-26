package rop.impl;

import rop.security.ServiceAccessController;
import rop.session.Session;

/**
 *
 * 功能说明：对调用的方法进行安全性检查
 *
 */
public class DefaultServiceAccessController implements ServiceAccessController {

    @Override
    public boolean isAppGranted(String appKey, String method, String version) {
        return true;
    }

    @Override
    public boolean isUserGranted(Session session, String method, String version) {
        return true;
    }
}

