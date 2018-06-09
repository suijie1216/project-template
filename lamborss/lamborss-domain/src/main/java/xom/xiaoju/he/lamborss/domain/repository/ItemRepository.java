package xom.xiaoju.he.lamborss.domain.repository;

import xom.xiaoju.he.lamborss.domain.model.Item;

import java.util.List;

/**
 * @author suijie
 */
public interface ItemRepository {
    List<Item> acquireItemListById(List<Long> itemIdList);
}
