package com.cmict.design.factory.impl;

import com.cmict.design.factory.GrantInterface;

import java.util.Map;

public class CouponGrantImpl implements GrantInterface {
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        System.out.printf("优惠券发放");
    }
}
