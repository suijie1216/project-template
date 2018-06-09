package com.xiaoju.keji.lamborg.domain.repository;

import com.xiaoju.keji.lamborg.domain.model.ItemOrder;
import com.xiaoju.keji.lamborg.domain.model.Order;
import com.xiaoju.keji.lamborg.domain.model.PayOrder;

/**
 * @author suijie
 */
public interface OrderRepository {
    void createTradeOrder(Order order);

    void createItemOrder(ItemOrder itemOrder);

    void createPayOrder(PayOrder payOrder);

    boolean enable(Order order);
}
