package org.springframework.kshfdjs.biz.action;

import org.springframework.kshfdjs.module.request.TradeRequest;
import org.springframework.kshfdjs.domain.model.Item;
import org.springframework.kshfdjs.domain.model.Promotion;
import org.springframework.kshfdjs.domain.handler.ItemQueryHandler;
import org.springframework.kshfdjs.domain.handler.PromotionQueryHandler;
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
