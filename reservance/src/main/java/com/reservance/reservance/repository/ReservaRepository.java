package com.reservance.reservance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.reservance.reservance.model.Reserva;

import jakarta.transaction.Transactional;


public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	
	@Query("SELECT n FROM Reserva n WHERE n.CPF = :cpf")
	List<Reserva> findReservasOfCPF(String cpf);
	
	@Query("SELECT n FROM Reserva n WHERE n.mesa.estab.nome = :EstabName AND n.CPF = :cpf")
	Reserva findReservaInEst(String EstabName, String cpf);
	
	@Query("SELECT r FROM Reserva r WHERE r.mesa.estab.nome = :Estab")
	List<Reserva> findAllEstReservas(String Estab);

	@Modifying
	@Transactional
	@Query("DELETE FROM Reserva n WHERE n.id = :IdReserva")
	void DeleteReserva(@Param("IdReserva") Long IdReserva);
}
