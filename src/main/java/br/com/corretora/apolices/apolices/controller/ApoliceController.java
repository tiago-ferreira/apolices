package br.com.corretora.apolices.apolices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.corretora.apolices.apolices.model.Apolice;
import br.com.corretora.apolices.apolices.service.ApoliceService;

@RestController
@RequestMapping("/apolices")
public class ApoliceController {

	@Autowired
	private ApoliceService apoliceService;
	
	
	@GetMapping
	public List<Apolice> getApolices() {
		return apoliceService.findAll();
	}
	
}
