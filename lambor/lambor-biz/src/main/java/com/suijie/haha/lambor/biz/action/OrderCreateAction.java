package com.suijie.haha.lambor.biz.action;

import com.suijie.haha.lambor.module.request.TradeRequest;
import com.suijie.haha.lambor.domain.model.Item;
import com.suijie.haha.lambor.domain.model.Order;
import com.suijie.haha.lambor.domain.model.Promotion;
import com.suijie.haha.lambor.domain.handler.ItemQueryHandler;
import com.suijie.haha.lambor.domain.service.OrderDomainService;
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
