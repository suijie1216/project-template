package xom.xiaoju.he.lamborss.domain.handler;

import xom.xiaoju.he.lamborss.domain.model.Item;
import xom.xiaoju.he.lamborss.domain.model.Promotion;
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
