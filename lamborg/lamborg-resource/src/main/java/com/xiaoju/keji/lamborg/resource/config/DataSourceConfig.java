package com.xiaoju.keji.lamborg.resource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @author suijie
 */
@Configuration
public class DataSourceConfig {
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.username}")
    private String dbUserName;
    @Value("${db.password}")
    private String dbPassword;
    @Value("${db.maxactive}")
    private int dbmaxActive;
    @Value("${db.minidle}")
    private int dbminIdle;

    @Bean("dataSource")
    public DataSource buildDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setMaxActive(dbmaxActive);
        dataSource.setInitialSize(dbminIdle);
        dataSource.setMinIdle(dbminIdle);

        dataSource.setTimeBetweenEvictionRunsMillis(30000);
        dataSource.setMinEvictableIdleTimeMillis(15000);

        dataSource.setValidationQuery("select 1");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);

        return dataSource;

    }

}

