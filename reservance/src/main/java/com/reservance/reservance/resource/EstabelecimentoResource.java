package com.reservance.reservance.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reservance.reservance.model.Estabelecimento;
import com.reservance.reservance.repository.ReservanceRepository;

@RestController
@RequestMapping("/")
public class EstabelecimentoResource {

	@Autowired
	private ReservanceRepository estabelecimentoRepository;
	
	@GetMapping
	public String teste()
	{
		return "oi";
	}
	
	@PostMapping("/api/estabelecimento")
	@ResponseStatus(HttpStatus.CREATED)
	public Estabelecimento save(@RequestBody Estabelecimento estabelecimento) {
	
		return estabelecimentoRepository.save(estabelecimento);
	
	}
	
}


