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

import com.reservance.reservance.model.Mesas;
import com.reservance.reservance.repository.MesasRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MesasResource {

	@Autowired
	private MesasRepository mr;
	
	@GetMapping("/mesas")
	public List<Mesas> getMesas(){
		return mr.findAll();
	}
	
	@PostMapping("/mesas")
	@ResponseStatus(HttpStatus.CREATED)
	public Mesas inserirMesa(@RequestBody Mesas mesa) {
		return mr.save(mesa);
	}
	
	@GetMapping("{name}/mesas")
	public List<Mesas> getByName(@PathVariable String name){
		return mr.findByEstName(name);
	}
	
	@GetMapping("{name}/mesas/{id}")
	public Mesas lerMesa(@PathVariable String name, @PathVariable Long id) {
		return mr.findEstMesa(name,id);
	}
	
	@PutMapping("{name}/mesas/{id}")
	public Mesas updateMesa(@PathVariable String name, @PathVariable Long id, @RequestBody Mesas mesa) {
		Mesas mesaAtual = mr.findEstMesa(name, id);
		BeanUtils.copyProperties(mesa, mesaAtual, "id");
		
		return mr.save(mesaAtual);
	}
	
	@DeleteMapping("{name}/mesas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteMesa(@PathVariable String name, @PathVariable Long id) {
		mr.deleteEstMesa(name, id);
	}
	
}
