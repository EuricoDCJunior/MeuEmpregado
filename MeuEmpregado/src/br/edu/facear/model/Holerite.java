package br.edu.facear.model;

public class Holerite {
	private int idHOLERITE = 0;
	private String dateHolerite = null;
	private double totalProventos = 0.00;
	private double totalDescontos = 0.00;
	private boolean Gerado = false;
	
	private Empregado empregado;
	private Empregador empregador;	
	private Beneficio bene;
	private Ferias ferias;
	private Contrato contrato;
	private ControlePonto ponto;
	private ImpostoEmpregado IMempregado;
	
	
	public int getIdHOLERITE() {
		return idHOLERITE;
	}
	public void setIdHOLERITE(int idHOLERITE) {
		this.idHOLERITE = idHOLERITE;
	}
	public String getDateHolerite() {
		return dateHolerite;
	}
	public void setDateHolerite(String dateHolerite) {
		this.dateHolerite = dateHolerite;
	}
	public double getTotalProventos() {
		return totalProventos;
	}
	public void setTotalProventos(double totalProventos) {
		this.totalProventos = totalProventos;
	}
	public double getTotalDescontos() {
		return totalDescontos;
	}
	public void setTotalDescontos(double totalDescontos) {
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
		return bene;
	}
	public void setBene(Beneficio bene) {
		this.bene = bene;
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
		return Gerado;
	}
	public void setGerado(boolean gerado) {
		Gerado = gerado;
	}
	public ImpostoEmpregado getIMempregado() {
		return IMempregado;
	}
	public void setIMempregado(ImpostoEmpregado iMempregado) {
		IMempregado = iMempregado;
	}
	
	

}
