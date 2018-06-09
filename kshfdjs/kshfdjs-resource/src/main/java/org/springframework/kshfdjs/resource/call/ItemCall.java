package org.springframework.kshfdjs.resource.call;

import org.springframework.kshfdjs.resource.entity.ItemEntity;
import org.springframework.litchi.http.Host;
import retrofit2.http.POST;

import java.util.List;

/**
 * @author suijie
 */
@Host("item.url")
public interface ItemCall {

    @POST("api/item/get")
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
