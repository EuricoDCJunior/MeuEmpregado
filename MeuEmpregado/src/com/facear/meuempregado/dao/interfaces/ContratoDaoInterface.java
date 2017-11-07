package com.facear.meuempregado.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import com.facear.meuempregado.model.*;

public interface ContratoDaoInterface extends DaoInterface<Contrato>{

	public ArrayList<Contrato> selecionarContratosValidos() throws ClassNotFoundException, SQLException;
	
}
