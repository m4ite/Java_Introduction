package Exercicios;
import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		float n1 = Obj_in.nextFloat();
		
		System.out.println("Número 2: ");
		float n2 = Obj_in.nextFloat();
		
		System.out.println("Operação:");
		System.out.println("A - adição; S - subtração; D - divisão; M - multiplicação; R- resto");
		
		String op = Obj_in.next();
		float r = 0;
		
		switch (op) {
			case "A":
				r = n1+n2;
				System.out.println(n1 + " + " + n2 + " = " + r);
				break;
			case "S":
				r = n1-n2;
				System.out.println(n1 + " - " + n2 + " = " + r);
				break;
			case "D":
				r = n1/n2;
				System.out.println(n1 + " / " + n2 + " = " + r);
				break;
			case "M":
				r = n1*n2;
				System.out.println(n1 + " * " + n2 + " = " + r);
				break;
			case "R":
				r = n1%n2;
				System.out.println(n1 + " % " + n2 + " = " + r);
				break;
			default:
				System.out.println("Entrada inválida!");
		}
		
		Obj_in.close();

	}

}
