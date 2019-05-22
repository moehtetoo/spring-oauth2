package com.moehtet.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.moehtet.mapper")
public class DatasourceConfig {
	
	@Autowired
	private DataSourceProperties prop;
	
	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create()
		          .driverClassName(prop.getDriverClassName())
		          .url(prop.getUrl())
		          .username(prop.getUsername())
		          .password(prop.getPassword())
		          .build(); 
	}
}
