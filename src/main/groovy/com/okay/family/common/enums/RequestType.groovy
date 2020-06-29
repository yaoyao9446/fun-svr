package com.okay.family.common.enums

import com.alibaba.fastjson.JSONArray

/**
 * 接口请求方式,get postform, postjson,枚举类
 */
public enum RequestType {

    GET(1, "GET"),
    POST_JSON(2, "POST-JSON"),
    POST_FORM(3, "POST-FORM")

    int code

    String desc

    RequestType(int code, String desc) {
        this.code = code
        this.desc = desc
    }

    static JSONArray getAll() {
        JSONArray result = new JSONArray()
        RequestType.values().each {x -> result << SourceCode.getJson("id=" + x.getCode(), "name=" + x.getDesc())}
        result
    }

}
