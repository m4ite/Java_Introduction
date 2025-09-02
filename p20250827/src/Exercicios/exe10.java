package Exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class exe10 {

	public static void main(String[] args) {
		Scanner Obj_in = new Scanner(System.in);
		int[] numeros = new int[4];
		
		for (int i = 0; i < 4; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = Obj_in.nextInt();
        }


        Arrays.sort(numeros);

        System.out.println("Números ordenados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        Obj_in.close();
	}

}
