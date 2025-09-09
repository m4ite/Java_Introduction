package cap4_ListaExercicios;
import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		
		String user = "admin";
		String senha = "1234";
		
		int count = 0;
		
		while (count < 3) {
			System.out.println("Usuario: ");
			String userInput = Obj_In.next();
			System.out.println("Senha: ");
			String senhaInput = Obj_In.next();
			
			if(user == userInput && senha == senhaInput) {
				System.out.println("Login efetuado!");
				break;
			}else {
				System.out.println("Login ou senha incorretos!");
				count ++;
			}
			
		}
		
		Obj_In.close();

	}

}
