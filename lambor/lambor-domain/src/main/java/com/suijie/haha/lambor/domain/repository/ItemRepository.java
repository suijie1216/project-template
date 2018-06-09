package com.suijie.haha.lambor.domain.repository;

import com.suijie.haha.lambor.domain.model.Item;

import java.util.List;

/**
 * @author suijie
 */
public interface ItemRepository {
    List<Item> acquireItemListById(List<Long> itemIdList);
}
