package cap4_ListaExercicios;
import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		System.out.println("Numero inicial: ");
		int numInicial = Obj_In.nextInt();
		System.out.println("Numero final: ");
		int numFinal = Obj_In.nextInt();
		
		int resultado = 0;
		
		for (int i = numInicial; i <= numFinal; i++) {
			if (i % 2 == 0) {
				continue;
			} else {
				resultado = resultado + i;
			}
			
		}
		
		System.out.println(resultado);
		Obj_In.close();

	}

}
