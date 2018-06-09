package com.suijie.haha.lambor.domain.model;

import lombok.Data;

import java.util.List;

/**
 * @author suijie
 */
@Data
public class ItemOrder {
    /** 商品订单id */
    private Long id;
    /** 订单金额（单位分），订单按原价计算总金额 */
    private Integer orderAmount;
    /** 优惠金额 */
    private Integer promotionAmount;
    /** 应付金额（单位分）= 订单金额 - 优惠金额 */
    private Integer saleAmount;
    /** 券包金额 */
    private Integer couponAmount;
    /** 实付金额（单位分）= 应付金额 - 券包金额 */
    private Integer payAmount;

    public static ItemOrder create(Long order, List<Item> item, Promotion promotion) {
        return null;
    }
}
