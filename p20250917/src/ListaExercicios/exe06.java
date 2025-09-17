package ListaExercicios;

public class exe06 {
	
	public void imprimirTabela(int n) {
		int r = 0;

		for (int i = 1; i<= n; i++) {
			for (int j = 1; j<= i; j++) {
				r = i * j;
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}
	
}
