package spring_projects.spring_project.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name = "authors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_generator", sequenceName = "authors_sequence", allocationSize=1)
public class Authors extends GenericModel {

    @Column(name="title", nullable = false)
    private String name;

    @Column(name="birth_day", nullable = false)
    private LocalDate birth_day;

    @Column(name="description", nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(name="books_authors",
            joinColumns=@JoinColumn(name="author_id"), foreignKey = @ForeignKey(name="FK_AUTHORS_BOOKS"),
            inverseJoinColumns=@JoinColumn(name="book_id"), inverseForeignKey=@ForeignKey(name="FK_BOOK_AUTHOR"))
    List<Book> books;
}
