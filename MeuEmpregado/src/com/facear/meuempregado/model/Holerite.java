package com.facear.meuempregado.model;

public class Holerite {
	private Integer idHolerite = 0;
	private String dataHolerite = null;
	private Long totalProventos ;
	private Long totalDescontos ;
	private Boolean gerado = false;
	
	private Empregado empregado;
	private Empregador empregador;	
	private Beneficio beneficio;
	private Ferias ferias;
	private Contrato contrato;
	private ControlePonto ponto;
	private ImpostoEmpregado IMempregado;
	
	
	public int getIdHOLERITE() {
		return idHolerite;
	}
	public void setIdHOLERITE(int idHolerite) {
		this.idHolerite = idHolerite;
	}
	public String getDateHolerite() {
		return dataHolerite;
	}
	public void setDateHolerite(String dataHolerite) {
		this.dataHolerite = dataHolerite;
	}
	public Long getTotalProventos() {
		return totalProventos;
	}
	public void setTotalProventos(Long totalProventos) {
		this.totalProventos = totalProventos;
	}
	public Long getTotalDescontos() {
		return totalDescontos;
	}
	public void setTotalDescontos(Long totalDescontos) {
		this.totalDescontos = totalDescontos;
	}
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}
	public Empregador getEmpregador() {
		return empregador;
	}
	public void setEmpregador(Empregador empregador) {
		this.empregador = empregador;
	}
	public Beneficio getBene() {
		return beneficio;
	}
	public void setBene(Beneficio beneficio) {
		this.beneficio = beneficio;
	}
	public Ferias getFerias() {
		return ferias;
	}
	public void setFerias(Ferias ferias) {
		this.ferias = ferias;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public ControlePonto getPonto() {
		return ponto;
	}
	public void setPonto(ControlePonto ponto) {
		this.ponto = ponto;
	}
	public boolean isGerado() {
		return gerado;
	}
	public void setGerado(boolean gerado) {
		gerado = gerado;
	}
	public ImpostoEmpregado getIMempregado() {
		return IMempregado;
	}
	public void setIMempregado(ImpostoEmpregado iMempregado) {
		IMempregado = iMempregado;
	}
	
	

}
