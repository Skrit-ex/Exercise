package com.example.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;
@EnableJpaRepositories(basePackages = "com.example")
@Configuration
public class HibernateConfiguration {

//    @Bean public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("admin");
//        return dataSource;
//    }
//
//    @Bean
//    public SessionFactory sessionFactory() {
//        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//        factoryBean.setPackagesToScan("com.example");
//        factoryBean.setDataSource(dataSource());
//        factoryBean.setHibernateProperties(hibernateProperties());
//        try { factoryBean.afterPropertiesSet();
//        } catch (IOException e) {
//            e.printStackTrace(); }
//        return factoryBean.getObject();
//    }
//    private Properties hibernateProperties() {
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//        hibernateProperties.setProperty("show_sql", "true");
//        return hibernateProperties;
//    }
}

