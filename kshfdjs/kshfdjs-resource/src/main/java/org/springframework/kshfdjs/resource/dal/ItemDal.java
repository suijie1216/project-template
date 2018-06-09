package org.springframework.kshfdjs.resource.dal;

import org.springframework.kshfdjs.domain.model.Item;
import org.springframework.kshfdjs.domain.repository.ItemRepository;
import org.springframework.kshfdjs.resource.call.ItemCall;
import org.springframework.kshfdjs.resource.entity.ItemEntity;
import org.springframework.kshfdjs.resource.transfer.ItemTransfer;
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
