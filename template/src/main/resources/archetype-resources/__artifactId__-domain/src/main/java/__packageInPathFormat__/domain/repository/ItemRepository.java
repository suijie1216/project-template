package ${package}.domain.repository;

import ${package}.domain.model.Item;

import java.util.List;

/**
 * @author suijie
 */
public interface ItemRepository {
    List<Item> acquireItemListById(List<Long> itemIdList);
}
