package org.tweeted.designpatterns.strategy;

/**
 * @author guan.yuhui
 * @Date 2021/12/3
 */
public interface IPayStrategy {

    /**
     * 提交支付
     */
    void paySubmit();

    /**
     * 查询支付结果
     */
    void findPayResult();

    /**
     * 取消支付
     */
    void cancelPayment();
}
