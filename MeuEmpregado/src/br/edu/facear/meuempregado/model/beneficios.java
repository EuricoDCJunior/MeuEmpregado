package br.edu.facear.meuempregado.model;

public class beneficios {

	private int id =0;
	private String descricao = null;
	private double vlrBonus = 0.00;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getVlrBonus() {
		return vlrBonus;
	}
	public void setVlrBonus(double vlrBonus) {
		this.vlrBonus = vlrBonus;
	}
	
}
