package Exercicios;
import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		System.out.println("Digite um número maior que 10: ");
		int num = Obj_in.nextInt();
		
		if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
			System.out.println("Numero é primo!");
		} else {
			System.out.println("Numero NÂO primo!");
		}
		
		Obj_in.close();

	}

}
