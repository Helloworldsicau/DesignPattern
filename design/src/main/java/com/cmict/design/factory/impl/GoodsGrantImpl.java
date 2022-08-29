package com.cmict.design.factory.impl;

import com.cmict.design.factory.GrantInterface;

import java.util.Map;

/**
 * 实物发放
 */
public class GoodsGrantImpl implements GrantInterface {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        System.out.printf("实物发放");
    }
}
