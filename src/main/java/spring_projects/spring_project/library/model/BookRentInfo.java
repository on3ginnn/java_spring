package spring_projects.spring_project.library.model;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@Entity
@Table (name = "book_rent_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_generator", sequenceName = "book_rent_info_sequence", allocationSize=1)
public class BookRentInfo extends GenericModel{

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="user_id", nullable = false,
            foreignKey = @ForeignKey(name="FK_RENT_BOOK_INFO_USER"))
    private User user;

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name="book_id", nullable = false,
            foreignKey = @ForeignKey(name="FK_RENT_BOOK_INFO_BOOK"))
    private Book book;

    @Column(name="rent_date", nullable = false)
    private LocalDateTime rentDate;

    @Column(name="retern_date", nullable = false)
    private LocalDateTime reternDate;

    @Column(name="rent_period", nullable = false)
    private Integer rentPeriod;

    @Column(name="is_returned", nullable = false)
    private Integer returned;
}
