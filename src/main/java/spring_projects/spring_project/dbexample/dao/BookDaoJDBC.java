package spring_projects.spring_project.dbexample.dao;

import spring_projects.spring_project.dbexample.model.Book;
import java.sql.*;

public class BookDaoJDBC {
    public Book findBookById (Integer bookId) {
        // Создание подключения.
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5433/nestor_db", "admin", "admin")) {
            if (connection != null) {
                System.out.println("Ура! Мы подключились к базе данных.");
            } else {
                System.out.println("БД недоступна.");
            }

            // Запрос к базе данных
            String select = "select * from public.books where id = ?";
            PreparedStatement selectQuery = connection.prepareStatement(select); // Подготовка зaпроса
            selectQuery.setInt(1, bookId);
            ResultSet resultSet = selectQuery.executeQuery(); // Результат запроса
            System.out.println(resultSet);
            // Создание и вывод объекта
            while (resultSet.next()) {
                System.out.println("f");
                Book book = new Book();
                book.setId(resultSet.getInt( "id"));
                System.out.println(book.getId());

                book.setAuthor(resultSet.getString("author"));
                book.setTitle(resultSet.getString("title"));
                book.setDateAdded(resultSet.getDate( "date_added"));
                System.out.println(book);
            }

        } catch (SQLException ex) {
            System.out.println("Error: "+ ex.getMessage());
        }
        return null;
    }
}