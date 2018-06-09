package org.springframework.kshfdjs.domain.repository;

import org.springframework.kshfdjs.domain.model.ItemOrder;
import org.springframework.kshfdjs.domain.model.Order;
import org.springframework.kshfdjs.domain.model.PayOrder;

/**
 * @author suijie
 */
public interface OrderRepository {
    void createTradeOrder(Order order);

    void createItemOrder(ItemOrder itemOrder);

    void createPayOrder(PayOrder payOrder);

    boolean enable(Order order);
}
