package com.aptproject.SpringLibraryProject;

import com.aptproject.SpringLibraryProject.dbexample.MyDBConfigContext;
import com.aptproject.SpringLibraryProject.dbexample.dao.BookDAOBean;
import com.aptproject.SpringLibraryProject.dbexample.dao.BookDaoJDBC;
import com.aptproject.SpringLibraryProject.dbexample.db.DBConnection;
import com.aptproject.SpringLibraryProject.dbexample.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SpringLibraryProjectApplication implements CommandLineRunner {

	@Value("${server.port}")
	private String serverPort;
	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.printf("http://localhost:%s/swagger-ui/index.html\n", this.serverPort);
		System.out.printf("http://localhost:%s/\n", this.serverPort);

	}
}
