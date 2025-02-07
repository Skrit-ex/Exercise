package com.example.repository;

import com.example.entity.FullBookDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FullDescriptionRepository extends JpaRepository <FullBookDescription, Long> {

    List<FullBookDescription> findAll();

    Optional<FullBookDescription> findById(Long id);
}
