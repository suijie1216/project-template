package com.suijie.haha.lambor.domain.repository;

import com.suijie.haha.lambor.domain.model.ItemOrder;
import com.suijie.haha.lambor.domain.model.Order;
import com.suijie.haha.lambor.domain.model.PayOrder;

/**
 * @author suijie
 */
public interface OrderRepository {
    void createTradeOrder(Order order);

    void createItemOrder(ItemOrder itemOrder);

    void createPayOrder(PayOrder payOrder);

    boolean enable(Order order);
}
