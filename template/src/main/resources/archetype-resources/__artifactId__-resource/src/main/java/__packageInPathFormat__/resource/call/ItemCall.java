package ${package}.resource.call;

import ${package}.resource.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author suijie
 */
@Host("item.url")
public interface ItemCall {

    @POST("api/item/get")
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
