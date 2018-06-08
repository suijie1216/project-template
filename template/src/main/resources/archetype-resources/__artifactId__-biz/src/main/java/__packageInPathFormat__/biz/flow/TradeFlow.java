package ${package}.biz.flow;

import ${package}.biz.action.OrderCreateAction;
import ${package}.biz.action.PromotionCalculateAction;
import ${package}.biz.request.TradeRequest;
import ${package}.biz.result.TradeCreateResult;
import ${package}.domain.model.Order;
import ${package}.domain.model.Promotion;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 交易流程
 *
 * @author ouliyuan
 * @date 2017-12-27
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
    public TradeCreateResult doCreate(TradeRequest trade) {
        /** 计算订单价格 */
        Promotion promotion = promotionCalculateAction.execute(trade);

        /** 创建交易订单 */
        Order order = orderCreateAction.execute(trade, promotion);

        // 结果封装
        return TradeCreateResult.create(order, promotion);
    }
}
