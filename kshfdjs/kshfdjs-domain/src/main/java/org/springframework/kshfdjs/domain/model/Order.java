package org.springframework.kshfdjs.domain.model;

import lombok.Data;

import java.util.List;

/**
 * @author suijie
 */
@Data
public class Order {
    /** 交易¬订单id */
    private Long id;
    /** 商品订单id */
    private Long itemOrderId;
    /** 支付订单id */
    private Long payOrderId;
    /** 优惠id */
    private Long promotionId;
    /** 订单状态 */
    private Integer status;
    /** 买家id */
    private Long buyerId;

    public static Order create(Long buyerId, List<Item> itemList) {
        return null;
    }

    public void enable(Long itemOrderId, Long payOrderId, Long promotionId) {
        this.itemOrderId = itemOrderId;
        this.payOrderId = payOrderId;
        this.promotionId = promotionId;
        this.status = OrderStatus.CREATED.getStatus();
    }

    public static enum OrderStatus {
        // 新创建
        NEW(0),
        // 已下单
        CREATED(1),
        // 已支付
        PAID(2),
        // 已收货
        CHECKED(3),
        // 已退款
        REFUND(4),
        // 已关闭
        CLOSED(5),
        // 未定义
        NONE(-1);

        private int status;

        OrderStatus(int status) {
            this.status = status;
        }

        public int getStatus() {
            return status;
        }
    }
}
