package br.edu.facear.meuempregado.model;

public class empregado {

	private int Id =0;
	private int nContrato = 0;
	private String nome = null;
	private String cpf = null;


	public empregado(int id, int nContrato, String nome, String cpf) {
		super();
		Id = id;
		this.nContrato = nContrato;
		this.nome = nome;
		this.cpf = cpf;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getnContrato() {
		return nContrato;
	}
	public void setnContrato(int nContrato) {
		this.nContrato = nContrato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
