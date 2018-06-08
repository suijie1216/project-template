package ${package}.biz.request;

import lombok.Data;

import java.util.List;

/**
 * @author ouliyuan
 * @date 2017-12-27
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
