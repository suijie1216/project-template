package ${package}.domain.handler;

import ${package}.domain.model.Item;
import ${package}.domain.model.Promotion;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ouliyuan
 * @date 2017-12-28
 */
@Component
public class PromotionQueryHandler {
    public Promotion calculateOrderPrice(Long buyerId, List<Item> itemList, Long promotionId) {
        return null;
    }
}
