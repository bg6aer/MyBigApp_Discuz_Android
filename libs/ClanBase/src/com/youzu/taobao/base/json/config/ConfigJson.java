package com.youzu.taobao.base.json.config;

import com.youzu.taobao.base.json.BaseResponse;

/**
 * Created by Zhao on 15/6/16.
 */
public class ConfigJson extends BaseResponse {


    private ClanConfig data;

    public ClanConfig getData() {
        return data;
    }

    public void setData(ClanConfig data) {
        this.data = data;
    }
}
