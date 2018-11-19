package br.com.corretora.apolices.apolices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.corretora.apolices.apolices.model.Apolice;
import br.com.corretora.apolices.apolices.service.ApoliceService;

@RestController
@RequestMapping("/apolices")
public class ApoliceController {

	@Autowired
	private ApoliceService apoliceService;
	
	
	@GetMapping
	public List<Apolice> getApolices(@RequestParam("cpf") String cpf,@RequestParam(value="documento_vigente", required=false) String documento_vigente,@RequestParam(value="companhia", required=false) String companhia) {
		System.out.println("CPF: "+cpf);
		System.out.println("Documento Vigente: "+documento_vigente);
		System.out.println("Companhia: "+companhia);
		return apoliceService.findAll();
	}
	
}
