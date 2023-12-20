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

import com.reservance.reservance.model.Reserva;
import com.reservance.reservance.repository.ReservaRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ReservaResource {
	
	@Autowired
	private ReservaRepository rp;
	
	@GetMapping("/reservas")
	public List<Reserva> getReservas(){
		return rp.findAll();
	}
	
	@PostMapping("/reservas")
	@ResponseStatus(HttpStatus.CREATED)
	public Reserva createReserva(@RequestBody Reserva reserva) {
		return rp.save(reserva);
	}
	
	@GetMapping("/reservas/{CPF}")
	public List<Reserva> getReservaByCPF(@PathVariable String name,@PathVariable String CPF) {
		return rp.findReservasOfCPF(CPF);
	}
	
	@GetMapping("{name}/reservas")
	public List<Reserva> getEstabReservas(@PathVariable String name) {
		return rp.findAllEstReservas(name);
	}
	
	@PutMapping("/{name}/reservas/{CPF}")
	public Reserva updateReserva(@PathVariable String name,@PathVariable String CPF, @RequestBody Reserva reserva) {
		Reserva reservaAtual = rp.findReservaInEst(name,CPF);
		BeanUtils.copyProperties(reserva, reservaAtual,"id");
		
		return rp.save(reservaAtual);
	}
	
	@DeleteMapping("/reservas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DeleteReserva(@PathVariable Long id) {
		rp.DeleteReserva(id);
	}

}
