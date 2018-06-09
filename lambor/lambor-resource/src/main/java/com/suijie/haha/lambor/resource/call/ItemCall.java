package com.suijie.haha.lambor.resource.call;

import com.suijie.haha.lambor.resource.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author suijie
 */
@Repository
public interface ItemCall {
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
