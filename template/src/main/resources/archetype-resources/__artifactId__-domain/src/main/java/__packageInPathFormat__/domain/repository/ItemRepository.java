package ${package}.domain.repository;

import ${package}.domain.model.Item;

import java.util.List;

/**
 * @author ouliyuan
 * @date 2017-12-28
 */
public interface ItemRepository {
    List<Item> acquireItemListById(List<Long> itemIdList);
}
