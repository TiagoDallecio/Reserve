package com.reservance.reservance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.reservance.reservance.model.Mesas;

import jakarta.transaction.Transactional;

public interface MesasRepository extends JpaRepository<Mesas, Long>{
	
	@Query("SELECT e FROM Mesas e WHERE e.estab.id = :IdEst")
	List<Mesas> findByIdEst(Long IdEst);
	
	@Query("SELECT n FROM Mesas n WHERE n.estab.nome = :EstName")
	List<Mesas> findByEstName(String EstName);
	
	@Query("SELECT e FROM Mesas e WHERE e.estab.nome = :EstName AND e.id = :IdMesa")
	Mesas findEstMesa(@Param("EstName") String EstName, @Param("IdMesa") Long IdMesa);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Mesas m WHERE m.estab.nome = :EstName AND m.id = :IdMesa")
	void deleteEstMesa(@Param("EstName") String EstName, @Param("IdMesa") Long IdMesa);
}
