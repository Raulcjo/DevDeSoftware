package view;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao;

public class SistemaMain {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		FabricaConexao fc = new FabricaConexao("root", "jdbc:mysql://localhost:3306/novobanco", "password");
		try {
			Connection con = fc.getConnection();
			con.close();
			System.out.println("Digite um nome da Pessoa:");
			in.nextLine(); //Usado para evitar que o nextLine pule a linha  
			String nome = in.nextLine();
			System.out.println("Digite um e-mail da Pessoa:");
			in.nextLine();
			String email = in.nextLine();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		in.close();
	}
}
