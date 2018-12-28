package com.xysy.gift.generator.action;


import com.xysy.gift.generator.action.config.CodeGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author xysy
 * @Date 2017/5/21 12:38
 */
public class CodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        CodeGeneratorConfig codeGeneratorConfig = new CodeGeneratorConfig();
        codeGeneratorConfig.doMpGeneration();

        /**
         * 生成器:
         *      代码生成器可以生成controller,html页面,页面对应的js
         */
        codeGeneratorConfig.doGeneration();
    }

}