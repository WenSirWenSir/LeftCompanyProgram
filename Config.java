package com.zbyj.Yazhou.LeftCompanyProgram;

public class Config {

    public static final String DEBUG = "LeftCompanyProgram";

    public static class HttpMethodUserAction{
        public static final int SEND_VERIFICATION = 0;
        public static final String KEY_ACTION = "action";
        public static final String KEY_USER = "user_md5";
        public static final String KEY_TOKEN = "user_token";
        public static final String KEY_STATUS = "status";//键值 获取状态
        public static final String KEY_PHONE  = "user_phone";
        public static final String KEY_CODE  = "user_code";
        public static final String STATUS_SENDOK = "0";
        public static final String STATUS_LOGINOK = "0";
        public static final String STATUS_LOGCODE_ERROR = "-3";//验证码错误
        public static final String STATUS_LOGCODE_TOMUCH = "-2";//错误次数太多
        public static final String CHECK_VERIFICATION = "1";
        public static final int UPDATE_USER_VALUES = 1;
    }

    /**
     * http request use method
     */
    public static class HttpMethod {
        public static final String HTTP_GET = "0";//use get
        public static final String HTTP_POST = "1";//use post
    }

    /**
     * gets the value in the returned data
     */
    public static class HttpMethodRequestStatus {
        public static final String HTTP_REQUEST_STATUS = "status";//http get status
    }


    /**
     * Status of  sucessful registration
     */
    public static class LRUserRequestStatus {
        public static final String LRUSER_OK = "0";//login sucess
        public static final String LRUSER_ERROR = "1";//login error,account can't login
        public static final String LRUSER_TOMUCH_ERROR = "2";//Too many login errors
        public static final String LRUSER_ERRORCODE = "3";//login failed,Verification is error
    }

    /**
     * in the returned HttpRequest Json
     * Corresponding field
     */
    public static class JSON_USERPAGE {
        public static final String USER_NAME = "name";
        public static final String USER_PHNOE = "phone";
        public static final String USER_PHONE_MD5 = "phone_md5";
        public static final String USER_EROR_NUMBER = "err_number";
        public static final String USER_TOKEN = "token";
        public static final String USER_SEX = "sex";
        public static final String USER_BIRTHDATE = "birthdate";
        public static final String USER_CARDID = "carid";
        public static final String USER_CARDNAME = "carname";
        public static final String USER_CARDSTART = "cardstart";
        public static final String USER_CARDEND = "cardend";
        public static final String USER_CARDIN = "cardin";
        public static final String USER_LEFTCOMPANY_ID = "leftcompany_id";
        public static final String USRE_LOGIN_VERIFICATION = "login_verifction";
        public static final String USER_REG_TIME = "reg_time";
        public static final String USER_HEADIMG = "head_img";
        public static final String USER_ABOUT = "user_about";
        public static final String USER_SIGNATURE = "user_signature";
        public static final String USER_LAST_INCOORD = "last_incoord";//The user last logged incoord,longitude in the former，the dimension in the end
        public static final String USER_EDUCATION = "education";//学历
        public static final String USER_INTEREST = "interest";//爱好
        public static final String USER_UNIT  = "unit";//单位
        public static final String USER_ISBLACK_LIST = "black_list";//用户是否黑名单  0 表示不是 1 表示为黑名单

    }


    /**
     * Returns the desired  service addrss
     * For example, send smsService,user login,get user data,update user data
     */
    public static class HTTP_ADDR {
        public static String SERVICE = "http://47.102.205.26/";

        /**
         * get the address of the interface to send SMS captha
         * <p>
         * <p>
         * this sms can Send a Verification code
         *
         * @return
         */
        public static String SendVerificationCodeAddr() {
            return HTTP_ADDR.SERVICE + "reg/register.php";
        }

        /**
         * 获取检查验证码的地址
         */
        public static String CheckVerificationAddr(){
            return HTTP_ADDR.SERVICE + "reg/register.php";
        }
    }

    /**
     * Use to select the template to send a SMS message
     */
    public static class SMS {

        public static final String SEND_SMS_OK = "0000";
        /**
         * Decide what type you want
         */
        public static final String USE_MODE_1 = "";
        public static final String USE_MODE_2 = "";
    }


    /**
     * the values use to get the data for android window
     */
    public static class Windows {


        public static final int GET_WINDOW_HEIGHT = 1;
        public static final int GET_WINDOW_WIDHT = 2;

    }

}
