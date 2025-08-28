package Scanner;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Cap3 - Scanner");
		System.out.println("Captura de dados via terminal");
		
		Scanner Obj_in = new Scanner(System.in);
		
		// LEITURA DE TEXTO
		System.out.println("Nome completo: ");
		String nome = Obj_in.nextLine(); // pega inputs com espaço
		System.out.println("Signo: ");
		String signo = Obj_in.nextLine(); // para de ler quando aperta o espaço
		
		System.out.println("Nome: " + nome);
		System.out.println("Signo: " + signo);
		
		
		
		//LEITURA DE NÚMEROS
		System.out.println("--NUMEROS PRIMOS --");
		System.out.println("Digite um número entre 0 e 10: ");
		int num = Obj_in.nextInt(); // Ler Int
		
		if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
			System.out.println("Numero é primo!");
		} else {
			System.out.println("Numero NÂO primo!");
		}
		
		Obj_in.close();
	}

}
