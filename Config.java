package com.zbyj.Yazhou.LeftCompanyProgram;

public class Config {

    /**
     * http访问的数据类型
     */
    public static class HttpMethod {
        public static final String HTTP_GET = "0";
        public static final String HTTP_POST = "1";
    }


    /**
     *获取返回数据的表示符
     */
    public static class HttpMethodRequestStatus{
        public static final String HTTP_REQUEST_STATUS = "status";//返回的状态
    }


    /**
     * 注册用户的登录返回的状态信息
     */
    public static class LRUserRequestStatus{
        public static final String LRUSER_OK = "0";//登录成功
        public static final String LRUSER_ERROR = "1";//登录失败 限制登录
        public static final String LRUSER_TOMUCH_ERROR = "2";//登录失败 验证码错误次数太多
        public static final String LRUSER_ERRORCODE = "3";//登录失败 验证码错误
    }


    /**
     * 返回的登录Json数据中 对应的用户的字段
     */
    public static class JSON_USERPAGE{
        public static final String USER_NAME = "name";//姓名
        public static final String USER_PHNOE = "phone";//电话
        public static final String USER_PHONE_MD5 = "phone_md5";//用户的加密MD5
    }

}
