package org.springframework.kshfdjs.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kshfdjs.resource.call.ItemCall;
import org.springframework.litchi.http.HttpServiceBuilder;

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
