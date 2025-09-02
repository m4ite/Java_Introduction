package Exercicios;
import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = Obj_in.nextInt();
		
		boolean par = IsPar(num);
		boolean positivo = IsPositivo(num);
		
		System.out.println( par ? "Par" : "Impar");
		System.out.println( positivo ? "Positivo" : "Negativo");

		Obj_in.close();
	}
	
	public static boolean IsPar(int n) {
		return n % 2 == 0;
	}
	
	public static boolean IsPositivo(int n) {
		return n > 0;
	}

}
