package spring_projects.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import spring_projects.spring_project.dbexample.dao.BookDAOBean;
import spring_projects.spring_project.dbexample.db.DBConnection;
import spring_projects.spring_project.dbexample.model.Book;

import java.util.List;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{}
}
