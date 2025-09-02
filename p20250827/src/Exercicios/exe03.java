package Exercicios;
import java.util.Arrays;
import java.util.Scanner;


public class exe03 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            numeros[i] = Obj_in.nextInt();
        }
		
		 Arrays.sort(numeros); 
		 
		 System.out.println("Números ordenados:");
		 for (int i = 2; i >= 0; i--) {
	            System.out.print(numeros[i] + " ");
	        }
		 
		 Obj_in.close();
	}

}
