package ${package}.domain.repository;

import ${package}.domain.model.ItemOrder;
import ${package}.domain.model.Order;
import ${package}.domain.model.PayOrder;

/**
 * @author ouliyuan
 * @date 2017-12-28
 */
public interface OrderRepository {
    void createTradeOrder(Order order);

    void createItemOrder(ItemOrder itemOrder);

    void createPayOrder(PayOrder payOrder);

    boolean enable(Order order);
}
