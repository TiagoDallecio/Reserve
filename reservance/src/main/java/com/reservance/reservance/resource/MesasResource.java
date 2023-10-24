package com.reservance.reservance.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reservance.reservance.model.Mesas;
import com.reservance.reservance.repository.MesasRepository;

@RestController
@RequestMapping("/estabelecimentos")
public class MesasResource {

	@Autowired
	private MesasRepository mr;
	
	@GetMapping("/mesas")
	public List<Mesas> getMesas(){
		return mr.findAll();
	}
	
	@GetMapping("/mesas/{id}")
	public List<Mesas> gebyID(@PathVariable Long id){
		return mr.findByIdEst(id);
	}
	
	@PostMapping("/mesas")
	@ResponseStatus(HttpStatus.CREATED)
	public Mesas inserirMesa(@RequestBody Mesas mesa) {
		return mr.save(mesa);
	}
	
	//@PutMapping("/mesas")
	
	
	
}
