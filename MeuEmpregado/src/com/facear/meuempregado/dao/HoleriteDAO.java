package com.facear.meuempregado.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.facear.meuempregado.model.*;

public class HoleriteDAO extends GenericDAO {

	private PreparedStatement ps;
	private ResultSet rs;
	/*SQL*/
	private String 	SQL_EMPREGADOR = "(SELECT * FROM TBEMPREGADOR WHILE userName=?);";	
	private String INNER_CONTRATO = "SELECT * FROM TBCONTRATO"
			+ "INNER JOIN TBEMPREGADO ON (TBEMPREGADO.idEmpregado == TBCONTRATO.idEmpregado)"
			+ "INNER JOIN TBEMPREGADOR ON (TBEMPREGADOR.idEmpregador == TBCONTRATO.idEmpregador)"
			+ "WHILE idEmpregador =?;";	
	private String SQL_INSERT = "INSERT INTO tbempregado(name , email , idcategory) VALUES (? , ? , ?);";
	
	/*object's*/
	private Empregador empregador;
	private Contrato contrato = new Contrato();
	private Holerite holerite = new Holerite();
	private Empregado empregado = new Empregado(0, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
	private List<Empregado> list = new ArrayList<Empregado>();
	

	/*Method ListEmpregado*/
	public List<Empregado> ListEmpregado(String userEmpregador) throws ClassNotFoundException, IOException, SQLException
	{
		/*open conection database*/
		openConnection();

		ps = connect.prepareStatement(SQL_EMPREGADOR);
		/*Entrada de dado para pesquisa*/ 

		ps.setString(1, userEmpregador);
		rs = ps.executeQuery();

		while(rs.next())
		{
			empregador.setId(rs.getInt("id"));
			empregador.setCpf("cpf");
			empregador.setCnpj("cnpj");
			empregador.setRazaoSocial("razaoSocial");
		}

		/*close conection database*/
		closeConnection();

		/*chamando o method*/
		list = returnEmpregados(empregador.getId());

		return list;
	}


	/*Method busca por contrato*/
	public List<Empregado> returnEmpregados(int idEmpregador) throws ClassNotFoundException, IOException, SQLException
	{

		/*open conection database*/
		openConnection();

		ps = connect.prepareStatement(INNER_CONTRATO);
		/*Entrada de dado para pesquisa*/ 

		ps.setInt(1, idEmpregador);
		rs = ps.executeQuery();

		while(rs.next())
		{
			empregado.setId(Integer.valueOf("empregadoId"));
			empregado.setNomeCompleto("nomeCompleto");
			empregado.setAtivo(Boolean.valueOf("status"));


			/*populando lista de  empregado*/
		    list.add(empregado);

		}

		/*close conection database*/
		closeConnection();
		
      return list;
	}


	/*Method GerarHolerite*/
	public void GerarHolerite(int idEmpregado){
		try {
			Holerite h = new Holerite();
			// Abrir conexão
			openConnection();
			// Preparar o comando SQL a ser enviado ao BD
			ps = connect.prepareStatement(SQL_INSERT);
			ps.setString(1, h.getDateHolerite());
			ps.setObject(2, h.getPonto().getHorasTrabalhadas());
			ps.setObject(3,h.getContrato().getSalario());
			ps.setLong(4,h.getTotalDescontos());
			ps.setLong(5,h.getTotalProventos());
			ps.setObject(6,h.getBene().getId());
			ps.setObject(7,h.getFerias().getStatus());
			ps.setObject(8,h.getEmpregado().getId());
			ps.setObject(9,h.getEmpregador().getId());
			// Executar o comando de INSERT, logo não se espera retorno
			ps.executeUpdate();
			// Fechar conexão
			closeConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		} catch (IOException e) {
			System.out.println("File not Found");
		} catch (SQLException e) {
			System.out.println("Error on Connecting(SALVAR)");
		}
	}
}
