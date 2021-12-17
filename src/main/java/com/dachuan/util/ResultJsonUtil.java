package com.dachuan.util;

import java.util.HashMap;
import java.util.Map;

public class ResultJsonUtil {
    public final static String RESULT = "result";
    public final static String DATA = "data";
    public final static String MSG = "msg";
    public final static String ROWS = "rows";
    //存放异常等错误信息，错误信息会弹错来
    public final static String ERROR_MSG = "errorMsg";
    //这个里面存放 form表单校验的错误，一个list，界面上显示是，在框后面加提示
    public final static String ERROR = "error";
    //用于区分 数据校验和系统异常
    public final static String EXCEPTION = "exception";
    public static String SUCCEED = "ok";
    public static String FAIL = "fail";

    public static Map<String, Object> getResultMap() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(RESULT, ResultJsonUtil.SUCCEED);
        return result;
    }

    public static Map<String, Object> getResultMap(String message) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(RESULT, ResultJsonUtil.SUCCEED);
        result.put(MSG, message);
        return result;
    }

    public static Map<String, Object> getResultErrorMap() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(RESULT, ResultJsonUtil.FAIL);
        return result;
    }

    public static Map<String, Object> getResultErrorMap(String errorMsg) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(RESULT, ResultJsonUtil.FAIL);
        result.put(ERROR_MSG, errorMsg);
        return result;
    }
}
