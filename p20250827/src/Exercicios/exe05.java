package Exercicios;
import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 7");
		int n = Obj_in.nextInt();
		
		switch (n) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5: 
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Entrada inválida");
		}
		
		Obj_in.close();

	}

}
