package controller;
import model.Pessoa;

public class PessoaController {
	//Regra de negócio de Pessoa
	public boolean addPessoa(String nome, String email) {
		if( nome != null && nome.matches("\D") && nome.length() > 3) {
			//Se for válido 
			//limpa espaços 
			//new Pessoa 
			//Envia para DAO
			Pessoa p = new Pessoa(nome, email);
		}
	}
}
