package manipArrays;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Cap 07 - Manip Arrays");

		DesafioArrays desafio = new DesafioArrays();
		//desafio.desafio2();
		// desafio.desafio3();
		//desafio.desafio4();
		//desafio.desafio5();
		//desafio.desafio6();
		//desafio.desafio7();
		
		String[] funcionarios = {"Maite","Ana","Paulo","Joao","Pedro"};
		int index = desafio.desafio8(funcionarios, "Ana");
		System.out.println("Posição: " + index);
	}

}
