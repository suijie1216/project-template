package ${package}.resource.mapper;

import ${package}.resource.entity.OrderEntity;

/**
 * @author suijie
 */
public interface OrderMapper {
    /**
     * 设置订单可见，关联商品订单id，支付订单id
     *
     * @param order 交易订单
     * @return 更新成功的记录数
     */
    int enable(OrderEntity order);
}
