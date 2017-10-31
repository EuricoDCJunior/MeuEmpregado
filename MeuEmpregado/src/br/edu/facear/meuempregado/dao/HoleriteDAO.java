package br.edu.facear.meuempregado.dao;

import java.util.ArrayList;
import java.util.List;
import br.edu.facear.meuempregado.model.*;

public class HoleriteDAO {
	
	contrato contrato = new contrato();
	holerite holerite = new holerite();
	empregado empregado = new empregado(0, 0, null, null);
	private List<empregado> list = new ArrayList<empregado>();
	
	/*Method ListEmpregado*/
	public List<empregado> ListEmpregado(int IdEmpregado)
	{
		
		if(empregado.getId() == contrato.getIdEMPREGADO())
		{
			if(contrato.getStatus().equals("ATIVO"))
			{
				list.add(empregado);
			}
			else
			{
				
			}	
		}
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
