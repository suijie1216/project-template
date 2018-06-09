package com.xiaoju.keji.lamborg.domain.repository;

import com.xiaoju.keji.lamborg.domain.model.Item;

import java.util.List;

/**
 * @author suijie
 */
public interface ItemRepository {
    List<Item> acquireItemListById(List<Long> itemIdList);
}
