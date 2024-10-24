package spring_projects.spring_project.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class GenericModel {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_generator")
    private Long id;

    @Column(name="created")
    private LocalDate created;

    @Column(name="createdBy")
    private String createdBy;

    @Column(name="deleted")
    private LocalDate deleted;

    @Column(name="deletedBy")
    private String deletedBy;

    @Column(name="isDeleted", columnDefinition = "boolean default false")
    private boolean isDeleted;

}
