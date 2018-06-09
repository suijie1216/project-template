package com.suijie.haha.lambor.resource.dao;

import com.suijie.haha.lambor.domain.model.ItemOrder;
import com.suijie.haha.lambor.domain.model.Order;
import com.suijie.haha.lambor.domain.model.PayOrder;
import com.suijie.haha.lambor.domain.repository.OrderRepository;
import com.suijie.haha.lambor.resource.entity.OrderEntity;
import com.suijie.haha.lambor.resource.transfer.OrderTransfer;
import com.suijie.haha.lambor.resource.mapper.OrderMapper;
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
