package com.github.joanacoll.apilibrary.repository;

import com.github.joanacoll.apilibrary.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibraryRepository extends JpaRepository<Library, Long> {
}