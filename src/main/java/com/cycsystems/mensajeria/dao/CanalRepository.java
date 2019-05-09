package com.cycsystems.mensajeria.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cycsystems.mensajeria.entities.Canal;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Integer> {

}
