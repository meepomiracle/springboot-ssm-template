package com.xysy.gift.modular.test.controller;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.xysy.gift.core.base.controller.BaseController;
import com.xysy.gift.core.base.warpper.BaseControllerWarpper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.xysy.gift.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.xysy.gift.modular.system.model.Test;
import com.xysy.gift.modular.test.service.ITestService;

import java.util.List;

/**
 * 控制器
 *
 * @author fengshuonan
 * @Date 2018-11-09 14:42:01
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    private String PREFIX = "/test/test/";

    @Autowired
    private ITestService testService;

    /**
     * 跳转到首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "test.html";
    }

    /**
     * 跳转到添加
     */
    @RequestMapping("/test_add")
    public String testAdd() {
        return PREFIX + "test_add.html";
    }

    /**
     * 跳转到修改
     */
    @RequestMapping("/test_update/{testId}")
    public String testUpdate(@PathVariable Integer testId, Model model) {
        Test test = testService.selectById(testId);
        model.addAttribute("item", test);
        LogObjectHolder.me().set(test);
        return PREFIX + "test_edit.html";
    }

    /**
     * 获取列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        Condition condition1 = new Condition();
        condition1.like("bbb", condition);
        List list = testService.selectList(condition1);
        return list;
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(Test test) {
        testService.insert(test);
        return SUCCESS_TIP;
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer testId) {
        testService.deleteById(testId);
        return SUCCESS_TIP;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Test test) {
        testService.updateById(test);
        return SUCCESS_TIP;
    }

    /**
     * 详情
     */
    @RequestMapping(value = "/detail/{testId}")
    @ResponseBody
    public Object detail(@PathVariable("testId") Integer testId) {
        return testService.selectById(testId);
    }
}
