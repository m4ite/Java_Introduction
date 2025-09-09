package cap4_ListaExercicios;
import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		
		int somaPares = 0;
		int somaImpares = 0;
		int contadorPares = 0;
		
		while (true) {
			System.out.println("Digite um número ou 0 para parar: ");
			int n = Obj_In.nextInt();
			
			if(n == 0) {
				System.out.println("soma dos numeros impares: " + somaImpares);
				System.out.println("média dos numeros pares: " + (contadorPares == 0 ? somaPares: (somaPares/contadorPares)));
				break;
			} else if ( n % 2 == 0) {
				somaPares += n;
				contadorPares ++;
			} else if ( n % 2 != 0) {
				somaImpares += n;
			} else {
				System.out.println("Entrada invalida!");
			}
		}
		
		Obj_In.close();

	}

}
