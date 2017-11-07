package com.facear.meuempregado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.TableGenerator;

@Entity
@TableGenerator(name ="tb_endereço")
public class EndereçoEntity {

	@Column(name = "cep")
	private String cep;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "cod_empregador_fk")
	private Integer cod_empregador_fk;
	
	
	public EndereçoEntity(String cep, String bairro, String rua, int numero, String complemento, String cidade,
			String estado, Integer cod_empregador_fk) {
		this.cep = cep;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cod_empregador_fk = cod_empregador_fk;
		
	}


	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Integer getCod_empregador_fk() {
		return cod_empregador_fk;
	}
	public void setCod_empregador_fk(Integer cod_empregador_fk) {
		this.cod_empregador_fk = cod_empregador_fk;
	}

	
	

}