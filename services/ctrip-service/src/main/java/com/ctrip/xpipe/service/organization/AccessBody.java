package com.ctrip.xpipe.service.organization;

import org.springframework.stereotype.Component;

/**
 * Created by zhuchen on 2017/8/31.
 */
@Component
public class AccessBody {
    String access_token;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
