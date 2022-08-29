1.工厂设计模式

![Image text](https://github.com/Helloworldsicau/images/blob/master/design/factory/factory.png)
那么在这里我们模拟积分兑换中的发放多种类型商品，假如现在我们有如下三种类型的商品接口；

序号	类型	接口
1	优惠券	CouponResult sendCoupon(String uId, String couponNumber, String uuid)
2	实物商品	Boolean deliverGoods(DeliverReq req)
3	第三方爱奇艺兑换卡	void grantToken(String bindMobileNumber, String cardId)
从以上接口来看有如下信息：

三个接口返回类型不同，有对象类型、布尔类型、还有一个空类型。
入参不同，发放优惠券需要仿重、兑换卡需要卡ID、实物商品需要发货位置(对象中含有)。
另外可能会随着后续的业务的发展，会新增其他种商品类型。因为你所有的开发需求都是随着业务对市场的拓展而带来的

