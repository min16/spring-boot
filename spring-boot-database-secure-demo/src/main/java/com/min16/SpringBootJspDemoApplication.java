package com.min16;

import com.min16.Config.AuthorityTypeHandler;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@MapperScan(value= {"com.min16.Mapper"})
@PropertySource("datasource.properties")
public class SpringBootJspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspDemoApplication.class, args);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

		sessionFactory.setDataSource(dataSource);

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
