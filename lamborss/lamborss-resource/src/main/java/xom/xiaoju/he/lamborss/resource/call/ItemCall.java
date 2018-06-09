package xom.xiaoju.he.lamborss.resource.call;

import xom.xiaoju.he.lamborss.resource.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author suijie
 */
@Repository
public interface ItemCall {
    List<ItemEntity> getItemListById(List<Long> itemIdList);
}
