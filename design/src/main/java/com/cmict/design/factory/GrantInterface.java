package com.cmict.design.factory;

import java.util.Map;

/**
 * 发放优惠券接口
 */
@FunctionalInterface
public interface GrantInterface {

    void  sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
