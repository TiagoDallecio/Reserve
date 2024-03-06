package com.reservance.reservance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reservance.reservance.model.Item;

public interface ItensRepository extends JpaRepository<Item, Long>{

}
