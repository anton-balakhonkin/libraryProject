package com.example.libraryproject.repository;

import com.example.libraryproject.entity.Edition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditionRepository extends JpaRepository<Edition, Integer> {

    List<Edition> findEditionsByTitleOrDescriptionContains(String string1, String string2);
}
