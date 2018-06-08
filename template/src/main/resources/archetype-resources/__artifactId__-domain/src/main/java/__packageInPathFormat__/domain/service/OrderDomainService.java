package ${package}.domain.service;

import ${package}.domain.model.*;
import ${package}.domain.repository.OrderRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ouliyuan
 * @date 2017-12-28
 */
@Component
public class OrderDomainService {
    /** 订单资源库 */
    @Resource
    private OrderRepository orderRepository;

    public Order create(Long buyerId, List<Item> itemList, Promotion promotion) {
        /** 创建交易订单 */
        Order order = Order.create(buyerId, itemList);
        // 交易订单持久化
        orderRepository.createTradeOrder(order);

        /** 创建商品订单 */
        ItemOrder itemOrder = ItemOrder.create(buyerId, itemList, promotion);
        // 商品订单持久化
        orderRepository.createItemOrder(itemOrder);

        /** 创建支付订单 */
        PayOrder payOrder = PayOrder.create(order.getId(), itemOrder.getPayAmount());
        // 支付订单持久化
        orderRepository.createPayOrder(payOrder);

        /** 设置交易订单可见 */
        order.enable(itemOrder.getId(), payOrder.getId(), promotion.getId());
        // 交易订单可见持久化
        orderRepository.enable(order);

        return order;
    }
}
