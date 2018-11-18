package br.com.corretora.apolices.apolices.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apolice {

	@JsonProperty("tipo_documento")
	private String tipoDocumento;
	@JsonProperty("numero_documento")
	private String numeroDocumento;
	@JsonProperty("nome_segurado")
	private String nomeSegurado;
	@JsonProperty("nome_seguradora")
	private String nomeSeguradora;
	@JsonProperty("nome_produto")
	private String nomeProduto;
	@JsonProperty("nome_familia")
	private String nomeFamilia;
	@JsonProperty("inicio_vigencia")
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDateTime inicioVigencia;
	@JsonProperty("fim_vigencia")
	@JsonFormat(pattern="dd/MM/yyyy")	
	private LocalDateTime fimVigencia;
	@JsonProperty("documento_vigente")
	private Boolean documentoVigente;
	@JsonProperty("nome_corretora")
	private String nomeCorretora;
	@JsonProperty("cnpj_corretora")
	private String cnpjCorretora;
	@JsonProperty("cnpj_seguradora")
	private String cnpjSeguradora;
	@JsonProperty("numero_processo_susep")
	private String numeroProcessoSusep;
	@JsonProperty("pagamento_em_atraso")
	private String pagamentoEmAtraso;
	@JsonProperty("valor_parcela")
	private BigDecimal valorParcela;
	@JsonProperty("importancia_segurada")
	private BigDecimal importanciaSegurada;
	
	
	
}
