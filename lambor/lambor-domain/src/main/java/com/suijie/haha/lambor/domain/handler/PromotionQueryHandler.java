package com.suijie.haha.lambor.domain.handler;

import com.suijie.haha.lambor.domain.model.Item;
import com.suijie.haha.lambor.domain.model.Promotion;
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
