package com.reservance.reservance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservance.reservance.model.Estabelecimento;

public interface ReservanceRepository extends JpaRepository<Estabelecimento, Long>{

}
