package xom.xiaoju.he.lamborss.domain.model;

import lombok.Data;

/**
 * @author suijie
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
