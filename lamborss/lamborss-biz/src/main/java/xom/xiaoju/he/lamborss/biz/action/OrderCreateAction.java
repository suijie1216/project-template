package xom.xiaoju.he.lamborss.biz.action;

import xom.xiaoju.he.lamborss.module.request.TradeRequest;
import xom.xiaoju.he.lamborss.domain.model.Item;
import xom.xiaoju.he.lamborss.domain.model.Order;
import xom.xiaoju.he.lamborss.domain.model.Promotion;
import xom.xiaoju.he.lamborss.domain.handler.ItemQueryHandler;
import xom.xiaoju.he.lamborss.domain.service.OrderDomainService;
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
