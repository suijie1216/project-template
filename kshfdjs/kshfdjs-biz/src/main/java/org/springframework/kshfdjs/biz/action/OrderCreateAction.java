package org.springframework.kshfdjs.biz.action;

import org.springframework.kshfdjs.module.request.TradeRequest;
import org.springframework.kshfdjs.domain.model.Item;
import org.springframework.kshfdjs.domain.model.Order;
import org.springframework.kshfdjs.domain.model.Promotion;
import org.springframework.kshfdjs.domain.handler.ItemQueryHandler;
import org.springframework.kshfdjs.domain.service.OrderDomainService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author suijie
 */
@Component
public class OrderCreateAction {
    /** 商品查询 */
    @Resource
    private ItemQueryHandler itemQueryHandler;
    /** 订单服务 */
    @Resource
    private OrderDomainService orderDomainService;

    public Order execute(TradeRequest trade, Promotion promotion) {
        /** 查询商品 */
        List<Item> itemList = itemQueryHandler.requireItemListById(trade.getItemIdList());

        /** 创建订单 */
        return orderDomainService.create(trade.getBuyerId(), itemList, promotion);
    }
}
