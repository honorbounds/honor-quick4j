package org.honor.core.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SysConstant {

    public static String SESSION_LOGIN = "SESSION_LOGIN";

    //店内端登录成功标�?	public static String SESSION_LOGIN_PASS = "PASS";

    //云管理端登录标识
    public static String SESSION_CLOUD_LOGIN_PASS = "CLOUDPASS";

    public static String NOT_LOGIN = "NOT_LOGIN";

    public static String OP_FLAG = "opflag";

    public static String OP_MESSAGE = "opmessage";

    public static String OP_FILEUPLOAD = "opfileupload";

    public static String SUCCESS = "操作成功";

    public static String FAIL = "操作失败";

    public static String Exception = "网络原因操作失败";

    public static String CALLBACK = "存在该职位员工，不能进行职位删除";

    public static String PHONE_MESSAGE = "（手机动态码，请完成验证�?如非本人操作，请忽略本短信";

    public static String PHONE_PASSWORD = "（请妥善保管您的密码�?您的密码";


    /************start by lingy*****************/

	/*
     * 注册手机验证�?	 */
    public static String PHONE_CODE_START = "（手机动态码，请完成验证�?如非本人操作，请忽略本短信�?感谢您注册使用饭统网，您的验证码";
    public static String PHONE_CODE_END = "【饭统网】";
    /*
     * 重置密码
     */
    public static String PHONE_RESTPASSWORD_START = "【饭统网】您账号正在申请密码重置，操作验证码";
    public static String PHONE_RESTPASSWORD_END = "，为保证您的账号安全，请不要将验证码透漏给他人";

    /*
     *审核
     */
    public static String PHONE_AUDIT = "【饭统网】感谢您注册使用饭统网，您的注册信息审核";

    /*
     * 食客注册短信通知
     */
    public static String PHONE_REGISTER = "【饭统网】您已注册饭统网会员，可使用手机号进行登陆，初始密码";

    /************end by lingy*****************/

    /**
     * 支付类型
     */
    public static String RECHARGETYPE_BANK = "3";
    public static String RECHARGETYPE_ALI = "1";
    public static String RECHARGETYPE_WX = "2";

    /**
     * 单条短信金额
     */
    public static BigDecimal oneMessagePay = new BigDecimal(0.1);
    /**
     * 单条短信字数
     */
    public static BigDecimal oneMessageCount = new BigDecimal(70);

    public static final Map<String, Object> SUCCESS_MODEL = new HashMap<>();
    public static final Map<String, Object> Fail_MODEL = new HashMap<>();

    static {
        SUCCESS_MODEL.put(SysConstant.OP_FLAG, 1);
        SUCCESS_MODEL.put(SysConstant.OP_MESSAGE, SysConstant.SUCCESS);
        Fail_MODEL.put(SysConstant.OP_FLAG, 0);
        Fail_MODEL.put(SysConstant.OP_MESSAGE, SysConstant.FAIL);
    }
}
