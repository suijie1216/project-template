package com.xiaoju.keji.lamborg.domain.handler;

import com.xiaoju.keji.lamborg.domain.model.Item;
import com.xiaoju.keji.lamborg.domain.model.Promotion;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author suijie
 */
@Component
public class PromotionQueryHandler {
    public Promotion calculateOrderPrice(Long buyerId, List<Item> itemList, Long promotionId) {
        return null;
    }
}
