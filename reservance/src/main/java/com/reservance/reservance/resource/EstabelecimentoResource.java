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

import com.reservance.reservance.model.Estabelecimento;
import com.reservance.reservance.repository.ReservanceRepository;

@RestController
@RequestMapping("/")
@CrossOrigin
public class EstabelecimentoResource {

	@Autowired
	private ReservanceRepository estabelecimentoRepository;
	
	@GetMapping("/api/estabelecimento")
	public List<Estabelecimento> listarEst(){
		return estabelecimentoRepository.findAll();
	}
	
	@GetMapping("/api/estabelecimento/{Id}")
	public Estabelecimento EstId(@PathVariable Long Id){
		return estabelecimentoRepository.findById(Id).get();
	}
	
	@DeleteMapping("/api/estabelecimento/{Id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEst(@PathVariable Long Id) {
		estabelecimentoRepository.deleteById(Id);
	}
	
	@PostMapping("/api/estabelecimento")
	@ResponseStatus(HttpStatus.CREATED)
	public Estabelecimento save(@RequestBody Estabelecimento estabelecimento) {
		System.out.println("requisição post recebida.");
		return estabelecimentoRepository.save(estabelecimento);
	
	}
	
	@PutMapping("/api/estabelecimento/{Id}")
	public Estabelecimento atualizaEst(@PathVariable Long Id, @RequestBody Estabelecimento estabelecimento) {
		Estabelecimento EstAtual = estabelecimentoRepository.findById(Id).get();
		BeanUtils.copyProperties(estabelecimento, EstAtual, "Id");
		return estabelecimentoRepository.save(EstAtual);
	}
	
	
}


