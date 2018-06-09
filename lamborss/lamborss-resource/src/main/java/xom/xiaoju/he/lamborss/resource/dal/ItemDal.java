package xom.xiaoju.he.lamborss.resource.dal;

import xom.xiaoju.he.lamborss.domain.model.Item;
import xom.xiaoju.he.lamborss.domain.repository.ItemRepository;
import xom.xiaoju.he.lamborss.resource.call.ItemCall;
import xom.xiaoju.he.lamborss.resource.entity.ItemEntity;
import xom.xiaoju.he.lamborss.resource.transfer.ItemTransfer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author suijie
 */
@Repository
public class ItemDal implements ItemRepository {
    Logger logger = LoggerFactory.getLogger("");
    /** 商品服务 */
    @Resource
    private ItemCall itemCall;

    @Override
    public List<Item> acquireItemListById(List<Long> itemIdList) {
        List<ItemEntity> itemList = itemCall.getItemListById(itemIdList);

        return ItemTransfer.transfer(itemList);
    }
}
