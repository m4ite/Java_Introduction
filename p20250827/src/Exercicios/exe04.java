package Exercicios;
import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		float n1 = Obj_in.nextFloat();
		
		System.out.println("Nota 2: ");
		float n2 = Obj_in.nextFloat();
		
		float media = (n1 + n2)/2;
		
		if(media >= 6) {
			System.out.println("Aprovado");
		} else if( media < 6 && media >=4 ) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		Obj_in.close();

	}

}
