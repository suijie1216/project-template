package ${package}.resource.call;

import ${package}.resource.entity.ItemEntity;
import retrofit2.http.POST;
import org.springframework.litchi.http.Host;
import java.util.List;

/**
 * @author suijie
 */
@Host("item.url")
public interface ItemCall {

    @POST("api/item/get")
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
