package ${package}.resource.dal;

import ${package}.domain.model.Item;
import ${package}.domain.repository.ItemRepository;
import ${package}.resource.call.ItemCall;
import ${package}.resource.entity.ItemEntity;
import ${package}.resource.factory.ItemFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ext.common.aspect.Call;
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
    @Call
    public List<Item> acquireItemListById(List<Long> itemIdList) {
        List<ItemEntity> itemList = itemCall.getItemListById(itemIdList);

        return ItemFactory.asDomain(itemList);
    }
}
