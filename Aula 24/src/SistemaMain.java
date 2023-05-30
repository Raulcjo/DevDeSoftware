import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class SistemaMain {
	public static void main(String [] args) {
		String url = "jdbc:mysql://localhost:3306/novobanco"; //caminho do banco de dados
		String user = "root"; //usuário
		String pass = "1234"; //senha
		Pessoa p1 = new Pessoa("Antonio", "antonio@gmail.com");
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Conectado!");
			//p1.inserirPessoa(con);
			listaPessoa = p1.listarPessoas(con);
			System.out.println(listaPessoa);
			con.close();
		}
		catch(SQLException ex) {
			System.out.println("Erro ao conectar ao banco de dados! " + ex.getMessage()); 
		}
		
	}
}
