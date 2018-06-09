package ${package}.api.test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: suijie
 * @date: 2018/5/28 11:47
 * @description:
 */
@SpringBootTest(classes = ApplicationStarter.class, properties = {"spring.profiles.active=test"})
public class DiscountTest extends AbstractTestNGSpringContextTests {


    @Test
    public void testPromotionQueryHandler(){

    }
}
