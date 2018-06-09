package xom.xiaoju.he.lamborss.resource.dao;

import xom.xiaoju.he.lamborss.domain.model.ItemOrder;
import xom.xiaoju.he.lamborss.domain.model.Order;
import xom.xiaoju.he.lamborss.domain.model.PayOrder;
import xom.xiaoju.he.lamborss.domain.repository.OrderRepository;
import xom.xiaoju.he.lamborss.resource.entity.OrderEntity;
import xom.xiaoju.he.lamborss.resource.transfer.OrderTransfer;
import xom.xiaoju.he.lamborss.resource.mapper.OrderMapper;
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
