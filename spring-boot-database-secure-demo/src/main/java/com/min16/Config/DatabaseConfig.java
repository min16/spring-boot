package com.min16.Config;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * Created by DevNewbie on 2017-02-14.
 */
@org.springframework.context.annotation.Configuration
@MapperScan(value= {"com.min16.Mapper"})
@PropertySource("datasource.properties")
public class DatabaseConfig {

    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        return new DataSource();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());

        Configuration configuration = new Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.getTypeAliasRegistry().registerAlias("User","com.min16.Domain.User");
        configuration.getTypeAliasRegistry().registerAlias("SimpleGrantedAuthority", "org.springframework.security.core.authority.SimpleGrantedAuthority");
        configuration.getTypeHandlerRegistry().register(AuthorityTypeHandler.class);
        sessionFactory.setConfiguration(configuration);

        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml");
        sessionFactory.setMapperLocations(res);
        return sessionFactory.getObject();
    }
}
