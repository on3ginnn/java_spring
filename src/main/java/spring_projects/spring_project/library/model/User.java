package spring_projects.spring_project.library.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="users",
        uniqueConstraints={
            @UniqueConstraint(name="uniqueEmail", columnNames = "email"),
            @UniqueConstraint(name="uniqueLogin", columnNames = "login")
        })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "default_generator", sequenceName = "user_sequence", allocationSize=1)
public class User extends GenericModel {
    @Column(name="login", nullable = false)
    private String login;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="phone", nullable = false)
    private String phone;

    @Column(name="address", nullable = false)
    private String address;
}
