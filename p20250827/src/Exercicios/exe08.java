package Exercicios;
import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		String nome = "admin";
		String senha = "1234";
		
		
		System.out.println("Nome: ");
		String nome_input = Obj_in.next();
		String senha_input = Obj_in.next();
		
		if(nome.equals(nome_input) && senha.equals(senha_input)) {
			System.out.println("Login efetuado!");
		} else {
			System.out.println("Credenciais inválidas");
		}
		
		Obj_in.close();

	}

}
