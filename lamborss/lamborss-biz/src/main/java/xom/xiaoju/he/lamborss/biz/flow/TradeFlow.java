package xom.xiaoju.he.lamborss.biz.flow;

import xom.xiaoju.he.lamborss.biz.action.OrderCreateAction;
import xom.xiaoju.he.lamborss.biz.action.PromotionCalculateAction;
import xom.xiaoju.he.lamborss.module.request.TradeRequest;
import xom.xiaoju.he.lamborss.module.response.TradeCreateResponse;
import xom.xiaoju.he.lamborss.domain.model.Order;
import xom.xiaoju.he.lamborss.domain.model.Promotion;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author suijie
 */
@Component
public class TradeFlow {
    /** 优惠查询 */
    @Resource
    private PromotionCalculateAction promotionCalculateAction;
    /** 订单创建 */
    @Resource
    private OrderCreateAction orderCreateAction;

    /**
     * 交易创建流程
     *
     * @param trade 交易请求
     * @return 交易创建结果
     */
    public TradeCreateResponse doCreate(TradeRequest trade) {
        /** 计算订单价格 */
        Promotion promotion = promotionCalculateAction.execute(trade);

        /** 创建交易订单 */
        Order order = orderCreateAction.execute(trade, promotion);

        // 结果封装
        return TradeCreateResponse.create(order, promotion);
    }
}
