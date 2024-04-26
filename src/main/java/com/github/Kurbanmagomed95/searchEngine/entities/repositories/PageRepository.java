package com.github.Kurbanmagomed95.searchEngine.entities.repositories;

import com.github.Kurbanmagomed95.searchEngine.entities.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PageRepository extends JpaRepository<Page, Integer> {
    long countBySiteId (int id);
    Optional<Page> findByPath (String path);

}
