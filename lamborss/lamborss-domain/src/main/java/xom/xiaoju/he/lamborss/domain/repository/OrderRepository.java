package xom.xiaoju.he.lamborss.domain.repository;

import xom.xiaoju.he.lamborss.domain.model.ItemOrder;
import xom.xiaoju.he.lamborss.domain.model.Order;
import xom.xiaoju.he.lamborss.domain.model.PayOrder;

/**
 * @author suijie
 */
public interface OrderRepository {
    void createTradeOrder(Order order);

    void createItemOrder(ItemOrder itemOrder);

    void createPayOrder(PayOrder payOrder);

    boolean enable(Order order);
}
