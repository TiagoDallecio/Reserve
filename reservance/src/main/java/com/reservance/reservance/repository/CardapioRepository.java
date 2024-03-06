package com.reservance.reservance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reservance.reservance.model.Cardapio;
import com.reservance.reservance.model.Item;

public interface CardapioRepository extends JpaRepository<Cardapio, Long>{
	
	@Query("SELECT i FROM Item i WHERE i.cardapio.id = :IdCard")
	List<Item> findCardItem(Long IdCard);

}
