package ${package}.resource.dao;

import ${package}.domain.model.ItemOrder;
import ${package}.domain.model.Order;
import ${package}.domain.model.PayOrder;
import ${package}.domain.repository.OrderRepository;
import ${package}.resource.entity.OrderEntity;
import ${package}.resource.factory.OrderFactory;
import ${package}.resource.mapper.OrderMapper;
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
        OrderEntity orderEntity = OrderFactory.asEntity(order);

        // 更新数据库
        int count = orderMapper.enable(orderEntity);

        // 是否设置成功
        return count > 0;
    }
}
