package com.reservance.reservance.resource;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reservance.reservance.model.Cardapio;
import com.reservance.reservance.model.Item;
import com.reservance.reservance.repository.CardapioRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CardapioResource {

	@Autowired
	private CardapioRepository cp;
	
	@GetMapping("/cardapio")
	public List<Cardapio> getCardapios(){
		return cp.findAll();
	}
	
	@GetMapping("/cardapio/{id}")
	public List<Item>GetIteminCard(@PathVariable Long id){
		return cp.findCardItem(id);
	}
	
	@PostMapping("/cardapio")
	@ResponseStatus(HttpStatus.CREATED)
	public Cardapio createCardapio(@RequestBody Cardapio cardapio) {
		return cp.save(cardapio);
	}
	
	@PutMapping("/cardapio/{id}")
	public Cardapio updateCardapio(@PathVariable Long id, @RequestBody Cardapio cardapio) {
		Cardapio cardapioAtual = cp.findById(id).get();
		BeanUtils.copyProperties(cardapio, cardapioAtual,"id");
		
		return cp.save(cardapioAtual);
	}
	
	@DeleteMapping("/cardapio/{id}")
	public void deleteCardapio(@PathVariable Long id) {
		 cp.deleteById(id);
	}
}
