package com.tansun.ider.web.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.tansun.ider.bus.impl.X5185BusImpl;
import com.tansun.ider.dao.beta.entity.CoreEventActivityRel;
import com.tansun.ider.framwork.api.ActionService;
import com.tansun.ider.model.bo.X5185BO;
import com.tansun.ider.web.WSC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @version:1.0
* @Description: 封锁码更新
* @author: admin
 */
@Service("X5185")
public class X5185ActionImpl implements ActionService {
	
	@Autowired
	private X5185BusImpl x5185BusImpl;
	
	@Override
	public Object execute(Map<String, Object> map) throws Exception {
		// 1. 将json反序列化成实体对象，事件公共区
		X5185BO x5185BO = JSON.parseObject((String) map.get(WSC.EVENT_PUBLIC_DATA_AREA_KEY), X5185BO.class, Feature.DisableCircularReferenceDetect);
		CoreEventActivityRel coreEventActivityRel = (CoreEventActivityRel) map.get(WSC.ACTIVITY_INFO);
		// 全局事件流水号
		String globalEventNo = (String) map.get(WSC.EVENT_ID);
		x5185BO.setGlobalEventNo(globalEventNo);
		x5185BO.setCoreEventActivityRel(coreEventActivityRel);
		
		return x5185BusImpl.busExecute(x5185BO);
	}

}
