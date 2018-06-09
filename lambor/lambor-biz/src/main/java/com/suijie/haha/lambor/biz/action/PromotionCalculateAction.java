package com.suijie.haha.lambor.biz.action;

import com.suijie.haha.lambor.module.request.TradeRequest;
import com.suijie.haha.lambor.domain.model.Item;
import com.suijie.haha.lambor.domain.model.Promotion;
import com.suijie.haha.lambor.domain.handler.ItemQueryHandler;
import com.suijie.haha.lambor.domain.handler.PromotionQueryHandler;
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
