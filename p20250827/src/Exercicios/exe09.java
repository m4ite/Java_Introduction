package Exercicios;
import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);

		System.out.println("Salario: ");
		double salario = Obj_in.nextDouble();
		
		double desconto;
		
		if(salario >= 5000) {
			desconto = salario * 0.1;
		} else if (salario < 5000 && salario > 2000) {
			desconto = salario * 0.05;
		} else {
			desconto = salario * 0.02;
		}
		
		double valor_final = salario - desconto;
		System.out.println("Salario com descontos: " + valor_final);
		
		Obj_in.close();
	}

}
