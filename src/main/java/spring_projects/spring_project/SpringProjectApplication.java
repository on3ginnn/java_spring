package spring_projects.spring_project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring_projects.spring_project.dbexample.dao.BookDAOBean;
import spring_projects.spring_project.dbexample.dao.BookDaoJDBC;
import spring_projects.spring_project.dbexample.db.DBConnection;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
//
	}

	@Override
	public void run(String... args) throws Exception {
//		BookDaoJDBC bookDaoJDBC = new BookDaoJDBC();
//		bookDaoJDBC.findBookById(1);

		BookDAOBean bookDAOBean = new BookDAOBean(DBConnection.INSTANCE.getConnection());
		bookDAOBean.findBookById(1);
	}
}
