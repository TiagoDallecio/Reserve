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

import com.reservance.reservance.model.Item;
import com.reservance.reservance.repository.ItensRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ItemResource {
	
	@Autowired
	private ItensRepository ir;
	
	@GetMapping("/itens")
	public List<Item> getItens() {
		return ir.findAll();
	}
	
	@PostMapping("/itens")
	@ResponseStatus(HttpStatus.CREATED)
	public Item addItem(@RequestBody Item item) {
		return ir.save(item);
	}
	
	@PutMapping("/itens/{id}")
	public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
		Item itemAtual = ir.findById(id).get();
		BeanUtils.copyProperties(item, itemAtual,"id");
		
		return ir.save(itemAtual);
	}
	
	@DeleteMapping("/itens/{id}")
	public void deleteItem(@PathVariable Long id) {
		ir.deleteById(id);
	}

}
