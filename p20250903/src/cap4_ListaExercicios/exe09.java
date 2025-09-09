package cap4_ListaExercicios;
import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		
		System.out.println("Nome do aluno: ");
		String nome = Obj_In.next();
		
		int soma = 0;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Nota " + i);
			soma = soma + Obj_In.nextInt();
		}
		
		float media = soma / 4;
		
		System.out.println("A média de " + nome + " é: " + media);

		Obj_In.close();
	}

}
