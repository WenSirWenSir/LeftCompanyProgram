package com.zbyj.Yazhou.LeftCompanyProgram;

public class Config {

    public static final String DEBUG = "LeftCompanyProgram";

    /**
     * http访问的数据类型
     */
    public static class HttpMethod {
        public static final String HTTP_GET = "0";
        public static final String HTTP_POST = "1";
    }


    /**
     * 获取返回数据的表示符
     */
    public static class HttpMethodRequestStatus {
        public static final String HTTP_REQUEST_STATUS = "status";//返回的状态
    }


    /**
     * 注册用户的登录返回的状态信息
     */
    public static class LRUserRequestStatus {
        public static final String LRUSER_OK = "0";//登录成功
        public static final String LRUSER_ERROR = "1";//登录失败 限制登录
        public static final String LRUSER_TOMUCH_ERROR = "2";//登录失败 验证码错误次数太多
        public static final String LRUSER_ERRORCODE = "3";//登录失败 验证码错误
    }

    /**
     * 返回的登录Json数据中 对应的用户的字段
     */
    public static class JSON_USERPAGE {
        public static final String USER_NAME = "name";//姓名
        public static final String USER_PHNOE = "phone";//电话
        public static final String USER_PHONE_MD5 = "phone_md5";//用户的加密MD5
        public static final String USER_EROR_NUMBER = "err_number";//用户登录错误次数
        public static final String USER_TOKEN = "token";//验证秘钥
        public static final String USER_SEX = "sex";//用户的性别
        public static final String USER_BIRTHDATE = "birthdate";//生日 即出生日期
        public static final String USER_CARDID = "carid";//身份证号码
        public static final String USER_CARDNAME = "carname";//身份证名称
        public static final String USER_CARDSTART = "cardstart";//身份证开始的时间
        public static final String USER_CARDEND = "cardend";//身份证失效时间
        public static final String USER_CARDIN = "cardin";//身份证所属的省份
        public static final String USER_LEFTCOMPANY_ID = "leftcompany_id";//用户在左边远景软件开发工作室的唯一ID
        public static final String USRE_LOGIN_VERIFICATION = "login_verifction";//登录验证码
        public static final String USER_REG_TIME = "reg_time";//用户注册的时间
    }


    /**
     * 返回所需要服务的地址
     */
    public static class HTTP_ADDR {
        public static String SERVICE = "http://47.102.205.26";


        /**
         * 获取发送短信验证码的接口地址
         *
         * @return
         */
        public static String reSendVerificationCodeAddr() {
            return HTTP_ADDR.SERVICE + "";
        }
    }


}
