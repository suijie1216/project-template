package ${package}.resource.config;

import com.xiaoju.automarket.energy.lamborghini.resource.call.ContractCall;
import com.xiaoju.automarket.energy.lamborghini.resource.call.RealTimeDiscountCall;
import com.xiaoju.automarket.knife.http.HttpServiceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author suijie
 */
@Configuration
public class CallConfig {

    @Bean
    public HttpServiceBuilder<ItemCall> buildItemCall(){
        return new HttpServiceBuilder<>(ItemCall.class);
    }

}
