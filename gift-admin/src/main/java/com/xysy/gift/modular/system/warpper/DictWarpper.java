package com.xysy.gift.modular.system.warpper;

import com.xysy.gift.core.common.constant.factory.ConstantFactory;
import com.xysy.gift.modular.system.model.Dict;
import com.xysy.gift.core.base.warpper.BaseControllerWarpper;
import com.xysy.gift.core.util.ToolUtil;

import java.util.List;
import java.util.Map;

/**
 * 字典列表的包装
 *
 * @author fengshuonan
 * @date 2017年4月25日 18:10:31
 */
public class DictWarpper extends BaseControllerWarpper {

    public DictWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        StringBuffer detail = new StringBuffer();
        Integer id = Integer.valueOf(map.get("id").toString());
        List<Dict> dicts = ConstantFactory.me().findInDict(id);
        if(dicts != null){
            for (Dict dict : dicts) {
                detail.append(dict.getCode() + ":" +dict.getName() + ",");
            }
            map.put("detail", ToolUtil.removeSuffix(detail.toString(),","));
        }
    }

}
