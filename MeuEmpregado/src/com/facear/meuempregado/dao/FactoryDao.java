package com.facear.meuempregado.dao;

import com.facear.meuempregado.dao.interfaces.ContratoDaoInterface;
import com.facear.meuempregado.dao.interfaces.EmpregadoDaoInterface;
import com.facear.meuempregado.dao.interfaces.EmpregadorDaoInterface;
import com.facear.meuempregado.dao.interfaces.ImpostoEmpregadoDaoInterface;

public class FactoryDao {

	public ContratoDaoInterface createContratoDao() {
		return new ContratoDao();
	}
	
	public EmpregadoDaoInterface createEmpregadoDao() {
		return new EmpregadoDao();
	}
	
	public EmpregadorDaoInterface createEmpregadorDao() {
		return new EmpregadorDao();
	}
	
	public ImpostoEmpregadoDaoInterface createImpostoEmpregadoDao() {
		return new ImpostoEmpregadoDao();
	}
}
