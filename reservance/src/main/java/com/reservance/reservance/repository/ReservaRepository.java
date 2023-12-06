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
	
	@Query("SELECT n FROM Reserva n WHERE n.mesa.numero = :numMesa AND n.id = :IdReserva")
	Reserva findReserva(Long IdReserva);
	
	@Query("SELECT n FROM Reserva n WHERE n.mesa.estab.nome = :EstabName AND n.CPF = :cpf")
	Reserva findReservaInEst(String EstabName, String cpf);

	@Modifying
	@Transactional
	@Query("DELETE n FROM Reserva WHERE n.id = :IdReserva")
	void DeleteReserva(@Param("IdReserva") Long IdReserva);
}
