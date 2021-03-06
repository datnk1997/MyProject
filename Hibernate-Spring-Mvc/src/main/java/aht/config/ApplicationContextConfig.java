package aht.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import aht.Validator.UserValidator;

@Configuration
@ComponentScan("aht.*")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class ApplicationContextConfig {

	  @Autowired
	  private Environment env;
	  
	  @Bean
	  public TilesConfigurer tileConfiguer() {
		  TilesConfigurer configurer = new TilesConfigurer();
		  configurer.setDefinitions("classpath:tiles.xml");
		  configurer.setCheckRefresh(true);
		  return configurer;
	  }
	 
	  @Bean
	  public MessageSource messageSource() {
	      ReloadableResourceBundleMessageSource bundleMessageSource = new ReloadableResourceBundleMessageSource();
	      bundleMessageSource.setBasename("classpath:messages");
	      bundleMessageSource.setDefaultEncoding("utf-8");
	      return bundleMessageSource;
	  }
	  @Bean(name = "viewResolver")
	  public ViewResolver getViewResolver() {
	      TilesViewResolver viewResolver = new TilesViewResolver();
	      return viewResolver;
	  }
	 
	  @Bean(name = "dataSource")
	  public DataSource getDataSource() {
	      DriverManagerDataSource dataSource = new DriverManagerDataSource();
	 
	      dataSource.setDriverClassName(env.getProperty("ds.database-driver"));
	      dataSource.setUrl(env.getProperty("ds.url"));
	      dataSource.setUsername(env.getProperty("ds.username"));
	      dataSource.setPassword(env.getProperty("ds.password"));
	 
	      return dataSource;
	  }
	 
	  @Autowired
	  @Bean(name = "sessionFactory")
	  public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
	      Properties properties = new Properties();
	      properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
	      properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
	      properties.put("current_session_context_class", env.getProperty("current_session_context_class"));
	      
	      LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	      factoryBean.setPackagesToScan(new String[] { "aht.Entity" });
	      factoryBean.setDataSource(dataSource);
	      factoryBean.setHibernateProperties(properties);
	      factoryBean.afterPropertiesSet();
	      //
	      SessionFactory sf = factoryBean.getObject();
	      return sf;
	  }
	 
	  @Autowired
	  @Bean(name = "transactionManager")
	  public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	      HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	 
	      return transactionManager;
	  }
	  @Bean
	  public UserValidator userValidator() {
		  return new UserValidator();
	  }
	 
	  /*@Bean(name = "UserDAO")
	  public UserDAO getUserDAO() {
	      return new UserDAOimp();
	  }*/
	  
	  /*@Bean(name="UserService")
	  public UserService getUserService() {
		  return new UserServiceImp();
	  }*/
	  
	  

}
