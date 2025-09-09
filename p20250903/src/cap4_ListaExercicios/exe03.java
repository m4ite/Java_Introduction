package cap4_ListaExercicios;
import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		System.out.println("Numero inicial: ");
		int numInicial = Obj_In.nextInt();
		System.out.println("Numero final: ");
		int numFinal = Obj_In.nextInt();
		
		for (int i = numInicial; i <= numFinal; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(i + " ");;
			} else {
				continue;
			}
			
		}
		
		Obj_In.close();

	}

}



