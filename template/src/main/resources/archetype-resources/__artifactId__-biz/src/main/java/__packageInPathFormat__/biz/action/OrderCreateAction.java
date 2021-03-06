package ${package}.biz.action;

import ${package}.module.request.TradeRequest;
import ${package}.domain.model.Item;
import ${package}.domain.model.Order;
import ${package}.domain.model.Promotion;
import ${package}.domain.handler.ItemQueryHandler;
import ${package}.domain.service.OrderDomainService;
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
