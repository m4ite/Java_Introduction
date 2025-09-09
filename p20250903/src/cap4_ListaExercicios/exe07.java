package cap4_ListaExercicios;
import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = Obj_In.nextInt();
		int r = 0;

		for (int i = 1; i<= n; i++) {
			for (int j = 1; j<= i; j++) {
				r = i * j;
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
		Obj_In.close();
	}

}
