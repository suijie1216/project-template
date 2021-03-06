package ${package}.biz.action;

import ${package}.module.request.TradeRequest;
import ${package}.domain.model.Item;
import ${package}.domain.model.Promotion;
import ${package}.domain.handler.ItemQueryHandler;
import ${package}.domain.handler.PromotionQueryHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author suijie
 */
@Component
public class PromotionCalculateAction {
    /** 商品查询 */
    @Resource
    private ItemQueryHandler itemQueryHandler;
    /** 优惠计算 */
    @Resource
    private PromotionQueryHandler promotionQueryHandler;

    public Promotion execute(TradeRequest tradeRequest) {
        /** 查询商品 */
        List<Item> itemList = itemQueryHandler.requireItemListById(tradeRequest.getItemIdList());

        /** 计算优惠 */
        return promotionQueryHandler.calculateOrderPrice(tradeRequest.getBuyerId(), itemList, tradeRequest.getPromotionId());
    }
}
