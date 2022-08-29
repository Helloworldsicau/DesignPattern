package com.cmict.design.factory.impl;

import com.cmict.design.factory.GrantInterface;

import java.util.Map;

/**
 * 优惠卡发放
 */
public class CardGrantImpl implements GrantInterface {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        System.out.printf("优惠卡发放");
    }

    public static void sendCommodity2(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        System.out.printf("优惠卡发放");
    }
}
