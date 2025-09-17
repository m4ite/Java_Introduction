package ListaExercicios;

public class exe03 {

	public void imprimirMultiplos (int n) {
		System.out.println("Múltiplos de " + n + ":");
		for (int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}

}
