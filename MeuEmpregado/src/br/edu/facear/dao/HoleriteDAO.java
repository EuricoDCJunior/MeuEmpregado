package br.edu.facear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.facear.model.*;

public class HoleriteDAO {
	
	Contrato contrato = new Contrato();
	Holerite holerite = new Holerite();
	Empregado empregado = new Empregado(0, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
	private List<Empregado> list = new ArrayList<Empregado>();
	
	/*Method ListEmpregado*/
	public List<Empregado> ListEmpregado(int IdEmpregado)
	{
		
		return list;
	}
	
    /*Method GerarHolerite*/
	public void GerarHolerite(int idEmpregado)
	{
	
	
		if(holerite.getEmpregado().getId() == idEmpregado)
		{
			if(holerite.isGerado() == true)
			{
				
			}
			
		}
	}

}
