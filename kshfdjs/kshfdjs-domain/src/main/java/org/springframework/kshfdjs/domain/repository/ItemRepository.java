package org.springframework.kshfdjs.domain.repository;

import org.springframework.kshfdjs.domain.model.Item;

import java.util.List;

/**
 * @author suijie
 */
public interface ItemRepository {
    List<Item> acquireItemListById(List<Long> itemIdList);
}
