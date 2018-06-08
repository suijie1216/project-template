package ${package}.resource.call;

import ${package}.resource.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author suijie
 */
@Repository
public interface ItemCall {
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
