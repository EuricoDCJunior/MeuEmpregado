package br.edu.facear.meuempregado.model;
import br.edu.facear.meuempregado.model.*;

public class holerite {
	private int idHOLERITE = 0;
	private String dateHolerite = null;
	private double totalProventos = 0.00;
	private double totalDescontos = 0.00;
	private boolean Gerado = false;
	
	private empregado empregado;
	private empregador empregador;	
	private beneficios bene;
	private ferias ferias;
	private impostos impostos;
	private contrato contrato;
	private controlePonto ponto;
	
	
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
	public empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(empregado empregado) {
		this.empregado = empregado;
	}
	public empregador getEmpregador() {
		return empregador;
	}
	public void setEmpregador(empregador empregador) {
		this.empregador = empregador;
	}
	public beneficios getBene() {
		return bene;
	}
	public void setBene(beneficios bene) {
		this.bene = bene;
	}
	public ferias getFerias() {
		return ferias;
	}
	public void setFerias(ferias ferias) {
		this.ferias = ferias;
	}
	public impostos getImpostos() {
		return impostos;
	}
	public void setImpostos(impostos impostos) {
		this.impostos = impostos;
	}
	public contrato getContrato() {
		return contrato;
	}
	public void setContrato(contrato contrato) {
		this.contrato = contrato;
	}
	public controlePonto getPonto() {
		return ponto;
	}
	public void setPonto(controlePonto ponto) {
		this.ponto = ponto;
	}
	public boolean isGerado() {
		return Gerado;
	}
	public void setGerado(boolean gerado) {
		Gerado = gerado;
	}
	

}
