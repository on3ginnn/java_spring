package com.start.rayan.library.repository;


import com.start.rayan.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends GenericRepository<Author>{
}
