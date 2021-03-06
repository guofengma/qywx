package com.github.qywx.core.response.user;

import com.alibaba.fastjson.JSON;
import com.github.qywx.core.response.Response;

import java.util.List;

/**
 * Created by kaijun on 2017/12/10.
 */
public class UserListResp extends Response {

    //用户列表
    private List<WxUserRes> userlist;

    public List<WxUserRes> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<WxUserRes> userlist) {
        this.userlist = userlist;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
