package com.github.Kurbanmagomed95.searchEngine.entities.repositories;

import com.github.Kurbanmagomed95.searchEngine.entities.Index;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IndexRepository extends JpaRepository<Index, Integer>, JpaSpecificationExecutor<Index> {
}
