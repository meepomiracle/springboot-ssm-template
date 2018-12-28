package com.xysy.gift.core.util;

import com.alibaba.fastjson.JSON;
import com.xysy.gift.core.exception.SystemException;
import com.xysy.gift.core.exception.SystemExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 * @author xysy
 * @date 2017-08-25 14:13
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new SystemException(SystemExceptionEnum.WRITE_ERROR);
        }
    }
}
