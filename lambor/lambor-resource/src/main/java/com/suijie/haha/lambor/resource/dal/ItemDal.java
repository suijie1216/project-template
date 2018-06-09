package com.suijie.haha.lambor.resource.dal;

import com.suijie.haha.lambor.domain.model.Item;
import com.suijie.haha.lambor.domain.repository.ItemRepository;
import com.suijie.haha.lambor.resource.call.ItemCall;
import com.suijie.haha.lambor.resource.entity.ItemEntity;
import com.suijie.haha.lambor.resource.transfer.ItemTransfer;
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
