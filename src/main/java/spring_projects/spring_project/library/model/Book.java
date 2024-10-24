package spring_projects.spring_project.library.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default-generator")
    private Long id;

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
}
