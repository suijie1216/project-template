package ${package}.resource.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author suijie
 */
@Configuration
@AutoConfigureAfter(MybatiesConfig.class)
public class MapperScannerConfig {
    @Bean
    public MapperScannerConfigurer buildMapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("org.springframework.litchi.mapper");
        return configurer;
    }
}
