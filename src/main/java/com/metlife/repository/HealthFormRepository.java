package com.metlife.repository;

import com.metlife.DTO.HealthForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthFormRepository extends JpaRepository<HealthForm, Long> {
}
