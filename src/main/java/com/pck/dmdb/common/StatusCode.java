package com.pck.dmdb.common;

/**
 * 状态码
 *
 * @author PCk
 */
public enum StatusCode {

    OK("200", "OK", "成功！"),
    WAIT("202", "WAIT", "请等待"),
    MISSING_PARAM("-1", "MISSING_PARAM", "参数缺失！"),
    INVALID_PARAM("-2", "INVALID_PARAM", "无效的参数值！"),
    TOKEN_ERROR("-50", "TOKEN_ERROR", "TOKEN认证失败！"),
    PERMISSION_DENIED("-51", "PERMISSION_DENIED", "权限校验失败！"),
    NULLPOINTER_ERROR("-98", "NULLPOINTER_ERROR", "空指针异常！"),
    UNKNOWN_EXCEPTION("-99", "UNKNOWN_EXCEPTION", "未知异常！"),
    UNKNOWN_ERROR("-100", "UNKNOWN_ERROR", "未知错误！"),
    EXECUTE_FAIL("-102", "EXECUTE_FAIL", "执行失败！"),
    OTHER("-199", "OTHER", "其他错误！");

    public final String code;
    public final String enMsg;
    public final String zhMsg;

    StatusCode(String code, String enMsg, String zhMsg) {
        this.code = code;
        this.enMsg = enMsg;
        this.zhMsg = zhMsg;
    }
}
