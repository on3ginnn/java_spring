package com.aptproject.SpringLibraryProject.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "book_rent_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_generator", sequenceName = "book_rent_seq_info", allocationSize = 1)
public class BookRentInfo extends GenericModel {

    @ManyToOne (cascade = {CascadeType.MERGE, CascadeType.PERSIST}) // у одного пользователя могут много аренд
    @JoinColumn(name = "user_id", nullable = false,
        foreignKey = @ForeignKey(name = "FK_RENT_BOOK_INFO_USER"))
    private User user;

    @ManyToOne (cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "book_id", nullable = false,
         foreignKey = @ForeignKey(name = "FK_RENT_BOOK_INFO_BOOK"))
    private Book book;

    @Column(name = "rent_date", nullable = false)
    private LocalDate rentDate;

    @Column(name = "return_date", nullable = false)
    private LocalDate returnDate;

    @Column(name = "rent_period", nullable = false)
    private Integer rentPeriod;

    @Column(name = "returned", nullable = false)
    private boolean returned;

}