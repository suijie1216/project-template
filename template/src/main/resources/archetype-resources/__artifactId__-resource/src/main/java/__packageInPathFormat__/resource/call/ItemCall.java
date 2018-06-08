package ${package}.resource.call;

import ${package}.resource.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ouliyuan
 * @date 2017-12-28
 */
@Repository
public interface ItemCall {
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
