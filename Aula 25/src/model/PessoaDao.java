package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDao {
	
	private Pessoa pessoa;
	
	//insert
	public void inserirPessoa(Pessoa p,  Connection con) {
		String sql = "INSERT INTO pessoa (nome, emial) VALUES (?, ?)"; 
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			int rowAffected = ps.executeUpdate();
			if(rowAffected == 1) {
				System.out.println("Sucesso ao inserir Pessoa");
			}
			else {
				System.out.println("ERR - Linhas" + rowAffected); 
			}
		}
		catch(SQLException e) {
			System.out.println("Erro ao inserir Pessoa");
		}
		
	}
	
	//search
	//update
	//delete
	
}
