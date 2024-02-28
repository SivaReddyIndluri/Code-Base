package com.ProjectPrac.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectPrac.entity.ShipmentEntity;

@Repository
public interface ShipmentRepo extends JpaRepository<ShipmentEntity, Integer> {

}
