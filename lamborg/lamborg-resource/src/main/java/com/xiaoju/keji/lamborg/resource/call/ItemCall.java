package com.xiaoju.keji.lamborg.resource.call;

import com.xiaoju.keji.lamborg.resource.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author suijie
 */
@Repository
public interface ItemCall {
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
