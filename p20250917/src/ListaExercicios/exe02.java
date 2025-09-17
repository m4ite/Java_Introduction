package ListaExercicios;

public class exe02 {

	public void imprimirSoma(int n1, int n2) {
		int soma = 0;
		
		while (n1 <= n2) {
			soma += n1;
			n1 ++;
		}
		
		System.out.println("Soma: " + soma);
	}

}
