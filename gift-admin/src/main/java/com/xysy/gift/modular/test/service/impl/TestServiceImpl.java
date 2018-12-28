package com.xysy.gift.modular.test.service.impl;

import com.xysy.gift.modular.system.model.Test;
import com.xysy.gift.modular.system.dao.TestMapper;
import com.xysy.gift.modular.test.service.ITestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lq
 * @since 2018-11-09
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
