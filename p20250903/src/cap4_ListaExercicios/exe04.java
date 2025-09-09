package cap4_ListaExercicios;
import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		System.out.println("Numero para calcular fatorial: ");
		int n = Obj_In.nextInt();
		
		int resultado = 1;
		
		for (int i = 1; i<= n; i++) {
			resultado = resultado * i;
		}
		
		System.out.println(resultado);
		
		Obj_In.close();
		
	}

}
