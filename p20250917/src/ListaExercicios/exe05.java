package ListaExercicios;

public class exe05 {

	public void imprimirY (int x) {
		int y = 0;
		while (y != 1) {
			if( x %2 == 0) {
				y = x /2;
			}
			else {
				y = 3 * x +1;
			}
			System.out.print(y + "->");
			x = y;
		}
	}

}
