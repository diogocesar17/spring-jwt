// package br.com.diogocesar.financialplan.config;

// import javax.sql.DataSource;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;

// import com.zaxxer.hikari.HikariConfig;
// import com.zaxxer.hikari.HikariDataSource;

// @Configuration
// public class DataSourceConfig {
    
//     @Value("${spring.driver-class-name}")
//     private String driverClassName;

//     @Value("${spring.datasource.password}")
//     private String password;

//     @Value("${spring.datasource.username}")
//     private String username;

//     @Value("${spring.datasource.url}")
//     private String dataSourceUrl;

//     @Bean
//     public DataSource dataSource() {
//         HikariConfig config = new HikariConfig();

//         config.setDataSourceClassName(driverClassName);
//         config.setJdbcUrl(dataSourceUrl);
//         config.setUsername(username);
//         config.setPassword(password);
//         config.setSchema("org.hibernate.dialect.MySQL5InnoDBDialect");
//         return new HikariDataSource(config);
//     }

// }
