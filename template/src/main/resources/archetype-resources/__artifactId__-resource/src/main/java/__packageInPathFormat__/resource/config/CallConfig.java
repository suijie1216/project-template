package ${package}.resource.config;

import org.springframework.litchi.http.HttpServiceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ${package}.resource.call.ItemCall;

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
