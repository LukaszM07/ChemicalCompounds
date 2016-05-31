package chemicalcompounds.configuration;

import org.postgresql.jdbc3.Jdbc3PoolingDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by lukasz on 30.05.16.
 */
@Configuration
public class DBConfig {

    @Bean
    public DataSource dataSource(){
        Jdbc3PoolingDataSource dataSource = new Jdbc3PoolingDataSource();
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("proj");
        dataSource.setUser("postgres");
        dataSource.setPassword("admin");
        dataSource.setMaxConnections(1);
        dataSource.setPortNumber(5432);

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}
