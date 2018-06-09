package xom.xiaoju.he.lamborss.domain.handler;

import xom.xiaoju.he.lamborss.domain.model.Item;
import xom.xiaoju.he.lamborss.domain.repository.ItemRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author suijie
 */
@Component
public class ItemQueryHandler {
    /** 商品资源库 */
    @Resource
    private ItemRepository itemRepository;

    @Cacheable
    public List<Item> requireItemListById(List<Long> itemIdList) {
        return itemRepository.acquireItemListById(itemIdList);
    }
}
