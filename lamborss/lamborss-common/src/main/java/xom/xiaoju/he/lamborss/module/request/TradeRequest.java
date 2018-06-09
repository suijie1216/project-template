package xom.xiaoju.he.lamborss.module.request;

import lombok.Data;

import java.util.List;

/**
 * @author suijie
 */
@Data
public class TradeRequest {
    /** 买家id */
    private Long buyerId;
    /** 商品id */
    private List<Long> itemIdList;
    /** 优惠id */
    private Long promotionId;
}
