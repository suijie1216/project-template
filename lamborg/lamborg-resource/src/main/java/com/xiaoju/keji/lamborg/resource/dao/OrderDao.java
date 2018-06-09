package com.xiaoju.keji.lamborg.resource.dao;

import com.xiaoju.keji.lamborg.domain.model.ItemOrder;
import com.xiaoju.keji.lamborg.domain.model.Order;
import com.xiaoju.keji.lamborg.domain.model.PayOrder;
import com.xiaoju.keji.lamborg.domain.repository.OrderRepository;
import com.xiaoju.keji.lamborg.resource.entity.OrderEntity;
import com.xiaoju.keji.lamborg.resource.transfer.OrderTransfer;
import com.xiaoju.keji.lamborg.resource.mapper.OrderMapper;
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
