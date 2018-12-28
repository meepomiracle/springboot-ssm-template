package com.xysy.gift.core.util;

import com.xysy.gift.config.properties.SystemProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(SystemProperties.class).getKaptchaOpen();
    }
}