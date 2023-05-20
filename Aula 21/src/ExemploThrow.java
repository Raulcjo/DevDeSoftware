import java.util.Scanner;

public class ExemploThrow {
	public static void main(String [] args) {
		String senha = "123456";
		Scanner in = new Scanner(System.in);
		String senhaUsuario;
		System.out.println("Informe a senha: ");
		senhaUsuario = in.next();
		try {
			if(senha.equals(senhaUsuario)) {
				System.out.println("Senha correta");
			}
			else {
				throw new Exception("A senha está incorreta!");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
