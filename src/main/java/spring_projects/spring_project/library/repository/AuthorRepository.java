package spring_projects.spring_project.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_projects.spring_project.library.model.Authors;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Long> {
}
