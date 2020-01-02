package com.ad.app.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    /** Configure Datasource either in application.yml OR as a Spring Configuration Bean*/
    @Bean
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/elmasri_db")
                .username("root")
                .password("")
                .build();
    }
}
