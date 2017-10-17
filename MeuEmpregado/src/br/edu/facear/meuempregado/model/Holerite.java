package br.edu.facear.meuempregado.model;

public class Holerite {
	private Integer id;
	private Double totalproventos;
	private Double liquidoareceber;
	private Double totaldescontos;
	
	public Holerite(Integer id, Double totalproventos , Double liquidoareceber , Double totaldescontos ){
		this.id = id;
		this.totalproventos = totalproventos;
		this.liquidoareceber = liquidoareceber;
		this.totaldescontos = totaldescontos;		
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getTotalproventos() {
		return totalproventos;
	}

	public void setTotalproventos(Double totalproventos) {
		this.totalproventos = totalproventos;
	}

	public Double getLiquidoareceber() {
		return liquidoareceber;
	}

	public void setLiquidoareceber(Double liquidoareceber) {
		this.liquidoareceber = liquidoareceber;
	}

	public Double getTotaldescontos() {
		return totaldescontos;
	}

	public void setTotaldescontos(Double totaldescontos) {
		this.totaldescontos = totaldescontos;
	}
}
