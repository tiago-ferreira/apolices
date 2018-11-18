package br.com.corretora.apolices.apolices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.corretora.apolices.apolices.model.Apolice;
import br.com.corretora.apolices.apolices.repository.ApoliceRepository;

@Service
public class ApoliceService {

	@Autowired
	private ApoliceRepository apoliceRepository;
	
	
	public List<Apolice> findAll() {
		return apoliceRepository.getApolices();
	}
}
