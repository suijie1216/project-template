package org.springframework.kshfdjs.domain.handler;

import org.springframework.kshfdjs.domain.model.Item;
import org.springframework.kshfdjs.domain.model.Promotion;
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
