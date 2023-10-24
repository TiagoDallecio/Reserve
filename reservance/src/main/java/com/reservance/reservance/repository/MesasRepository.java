package com.reservance.reservance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reservance.reservance.model.Mesas;

public interface MesasRepository extends JpaRepository<Mesas, Long>{
	
	@Query("SELECT e FROM Mesas e WHERE e.estab.id = :IdEst")
	List<Mesas> findByIdEst(Long IdEst);

}
