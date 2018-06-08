package ${package}.domain.model;

import lombok.Data;

/**
 * @author ouliyuan
 * @date 2017-12-28
 */
@Data
public class PayOrder {
    /** 支付订单id */
    private Long id;
    /** 支付流水号 */
    private String bizId;

    public static PayOrder create(Long id, Integer payAmount) {
        return null;
    }
}
