package br.com.corretora.apolices.apolices.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.corretora.apolices.apolices.model.Apolice;

@Repository
public class ApoliceRepository {

	private static  List<Apolice> apolices = new LinkedList<>();
	
	
	static {
		
		apolices.add(new Apolice("individual", "01.68.4002035.0000000.1", "Joaquim Jose", "Itau Seguros", "ACID. PESSOAIS", "Vida", LocalDateTime.now(), LocalDateTime.now(), true, "Itau Corretora de Seguros", "97.619.507/0001-60", "31.840.059/0001-11", "3121.840.0592.2340001.2311", "N", new BigDecimal("19.00"), new BigDecimal("20.000")));
		apolices.add(new Apolice("certificado", "01.68.4002036.0000000.1", "Joao Severo", "Itau Seguros", "Auto", "Auto", LocalDateTime.now(), LocalDateTime.now(), true, "Itau Corretora de Seguros", "97.619.507/0001-60", "31.840.059/0001-11", "3121.840.0592.2340001.2311", "N", new BigDecimal("30.00"), new BigDecimal("30.000")));
		apolices.add(new Apolice("individual", "01.68.4002037.0000000.1", "Abedias Candido", "Itau Seguros", "Seguro Viagem", "Viagem", LocalDateTime.now(), LocalDateTime.now(), true, "Itau Corretora de Seguros", "97.619.507/0001-60", "31.840.059/0001-11", "3121.840.0592.2340001.2311", "N", new BigDecimal("9.00"), new BigDecimal("9.000")));
	
	}
	
	
	public List<Apolice> getApolices() {
		return apolices;
	}
	
}
