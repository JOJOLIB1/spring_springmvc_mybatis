package com.jjj.spring5.tx;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;

/**
 * @className: com.jjj.spring5.tx.txConfig
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-04 9:27
 */
@Configuration
@ComponentScan(basePackages = "com.jjj.spring5.tx")
@EnableTransactionManagement
public class txConfig {
    @Bean
    public DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://43.142.25.180:3306/dep_db");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("Hello_world_123!!~~~");
        druidDataSource.setDriverClassName("om.mysql.cj.jdbc.Driver");
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    // 手动调用会创建对象
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }
}
