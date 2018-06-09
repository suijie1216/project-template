package org.springframework.kshfdjs.resource.dao;

import org.springframework.kshfdjs.domain.model.ItemOrder;
import org.springframework.kshfdjs.domain.model.Order;
import org.springframework.kshfdjs.domain.model.PayOrder;
import org.springframework.kshfdjs.domain.repository.OrderRepository;
import org.springframework.kshfdjs.resource.entity.OrderEntity;
import org.springframework.kshfdjs.resource.transfer.OrderTransfer;
import org.springframework.kshfdjs.resource.mapper.OrderMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author suijie
 */
@Repository
public class OrderDao implements OrderRepository {
    /** 订单Mapper */
    @Resource
    private OrderMapper orderMapper;

    @Override
    public void createTradeOrder(Order order) {

    }

    @Override
    public void createItemOrder(ItemOrder itemOrder) {

    }

    @Override
    public void createPayOrder(PayOrder payOrder) {

    }

    @Override
    public boolean enable(Order order) {
        // 领域对象转数据对象
        OrderEntity orderEntity = OrderTransfer.transfer(order);

        // 更新数据库
        int count = orderMapper.enable(orderEntity);

        // 是否设置成功
        return count > 0;
    }
}
