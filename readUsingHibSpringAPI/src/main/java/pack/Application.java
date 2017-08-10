package pack;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.boot.SpringBootConfiguration;
//import javax.sql.DataSource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;



//@EnableJpaRepositories
//@EnableTransactionManagement
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class Application {

    public static void main(String[] args) { SpringApplication.run(Application.class, args);



    }
}

