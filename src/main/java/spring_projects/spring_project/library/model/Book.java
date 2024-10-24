package spring_projects.spring_project.library.model;

import jakarta.persistence.*;

import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_generator", sequenceName = "books_sequence", allocationSize=1)
public class Book extends GenericModel {

    @Column(name="title", nullable = false)
    private String bookTitle;

    @Column(name="publisher")
    private String publisher;

    @Column(name="publish_date", nullable = false)
    private Date publishDate;

    @Column(name="amount", nullable = false)
    private Integer amount;

    @Column(name="storage_place", nullable = false)
    private String storagePlace;

    @Column(name="online_copy_path")
    private String onlineCopyPath;

    @Column(name="genre", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @Column(name="description")
    private String description;

    @ManyToMany(mappedBy = "books")
    List<Authors> authors;
}
