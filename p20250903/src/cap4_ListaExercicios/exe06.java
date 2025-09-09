package cap4_ListaExercicios;
import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner Obj_In = new Scanner(System.in);
		System.out.println("Digite um número: : ");
		int x = Obj_In.nextInt();
		int y = 0;

		while (x > 1) {
			if(x % 2 == 0) {
				y = x/2;
			} else {
				y = 3 * x + 1;
			}
			
			System.out.println("y: " + y);
			x = y;
		}
		
		Obj_In.close();
		
	}

}
