package com.xiaoju.keji.lamborg.biz.action;

import com.xiaoju.keji.lamborg.module.request.TradeRequest;
import com.xiaoju.keji.lamborg.domain.model.Item;
import com.xiaoju.keji.lamborg.domain.model.Promotion;
import com.xiaoju.keji.lamborg.domain.handler.ItemQueryHandler;
import com.xiaoju.keji.lamborg.domain.handler.PromotionQueryHandler;
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
