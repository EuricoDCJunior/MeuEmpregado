package com.facear.meuempregado.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.facear.meuempregado.model.Empregado;
import com.facear.meuempregado.model.ImpostoEmpregado;

public interface ImpostoEmpregadoDaoInterface extends DaoInterface<ImpostoEmpregado>{

	public ArrayList<ImpostoEmpregado> selecionar(Empregado empregado) throws ClassNotFoundException, SQLException;
	
	public ArrayList<ImpostoEmpregado> selecionar(Empregado empregado,Date mes) throws ClassNotFoundException, SQLException;

	public ArrayList<ImpostoEmpregado> selecionar(Empregado empregado,String pesquisa) throws ClassNotFoundException, SQLException;
}
