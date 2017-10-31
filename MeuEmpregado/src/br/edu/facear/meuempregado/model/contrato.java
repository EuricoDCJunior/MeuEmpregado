package br.edu.facear.meuempregado.model;

public class contrato {

	private int idContrato= 0;
	private String status =null;
	private int idSALARIOBASE = 0;
	private int idEMPREGADO = 0;
	private int idEMPREGADOR = 0;
	private int idCARGO = 0;
	
	public int getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}
	public int getIdSALARIOBASE() {
		return idSALARIOBASE;
	}
	public void setIdSALARIOBASE(int idSALARIOBASE) {
		this.idSALARIOBASE = idSALARIOBASE;
	}
	public int getIdEMPREGADO() {
		return idEMPREGADO;
	}
	public void setIdEMPREGADO(int idEMPREGADO) {
		this.idEMPREGADO = idEMPREGADO;
	}
	public int getIdEMPREGADOR() {
		return idEMPREGADOR;
	}
	public void setIdEMPREGADOR(int idEMPREGADOR) {
		this.idEMPREGADOR = idEMPREGADOR;
	}
	public int getIdCARGO() {
		return idCARGO;
	}
	public void setIdCARGO(int idCARGO) {
		this.idCARGO = idCARGO;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
