package manipArrays;
import java.util.Scanner;
import java.util.Arrays;

public class DesafioArrays extends Principal {

	public void desafio2() {
		String[] nomeFunc = {"Alberto", "Janaina", "Pablo", "Marcia"};
		int[] anoContratacao = {2002, 2010, 2021, 2014};
		String[] cidadeFunc = new String[4];
		double[] salarioFunc = new double[4];
		boolean[] ativoFunc = new boolean[4];
		
		cidadeFunc[0] = "Curitiba";
		cidadeFunc[1] = "Arapoti";
		cidadeFunc[2] = "Foz do Iguaçu";
		cidadeFunc[3] = "Jacarezinho";
		
		
		//Maneira1
		String nomeFunc1 = nomeFunc[0];
		String cidadeFunc1 = cidadeFunc[0];
		System.out.println("O funcionário " + nomeFunc1 + " nasceu em "+ cidadeFunc1);
		
		//Maneira2
		System.out.println("O funcionário " + nomeFunc[1] + " nasceu em " + cidadeFunc[1]);
	}
	
	public void desafio3() {
		Scanner obj_in = new Scanner(System.in);
		
		String[] nomeCliente = new String[3];
		double[] valorPedido = new double[3];
		
		for (int i = 0; i < nomeCliente.length; i++) {
			System.out.println("Nome do cliente " + i + ": ");
			nomeCliente[i] = obj_in.next();
			System.out.println("Valor do pedido " + i + ": ");
			valorPedido[i] = obj_in.nextDouble();
		}
		
		obj_in.close();
		
		
		System.out.println("Cliente - Valor do Pedido");
		for (int i = 0; i < valorPedido.length; i++) {
			System.out.println(nomeCliente[i] + " - " + valorPedido[i]);
		}
	}
	
	public void desafio4() {
		Scanner obj_in = new Scanner(System.in);
		
		String[] alunos = new String[4];
		double[] notas1Bim = new double[4];
		double[] notas2Bim = new double[4];
		
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Nome do aluno " + (i +1) + ":");
			alunos[i] = obj_in.next();
			System.out.println("Nota bimestre 1: ");
			notas1Bim[i] = obj_in.nextDouble();
			System.out.println("Nota bimestre 2: ");
			notas2Bim[i] = obj_in.nextDouble();
		}
		
		obj_in.close();
		double media = 0;
		String status = "";
		
		
		System.out.println("Aluno - media - status");
		for (int i = 0; i < alunos.length; i++) {
			media = (notas1Bim[i] + notas2Bim[i])/2;
			if(media >= 6) {
				status = "Aprovado";
			} else if( media >= 4 && media < 6) {
				status = "Recuperação";
			} else {
				status = "Reprovado";
			}
			
			
			System.out.println(alunos[i] + " - " + media + "- " + status);
		}
		
		
	}

	public void desafio5() {
		Scanner obj_in = new Scanner(System.in);
		String[][] funcionarios = new String[2][3];
		
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("Funcionario: ");
			funcionarios[i][0] = obj_in.next();
			System.out.println("Cargo: ");
			funcionarios[i][1] = obj_in.next();
			System.out.println("Salário: ");
			funcionarios[i][2] = obj_in.next();
		}
		
		System.out.println("Funcionarios cadastrados com sucesso!");
		System.out.println("Liste o cargo do qual deseja litar os funcionários: ");
		String search = "";
		search = obj_in.next();
		
		for (int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i][1].equals(search)) {
				System.out.println("Funcionario: " + funcionarios[i][0]);
				System.out.println("Cargo: " +funcionarios[i][1]);
				System.out.println("Salario: " + funcionarios[i][2]);
				System.out.println("---------------------");
			}
			
		}
		
		obj_in.close();
		
	}
	
	public void desafio6() {
		int[] numeros = {5,3,8,1,2};
		Arrays.sort(numeros);
		System.out.println(numeros); // ele retorna o endereço da memória do array
	}
	
	public void desafio7() {
		Scanner obj_in = new Scanner(System.in);
		String[] cidades = new String[4];
		String aux = "";
		
		for (int i = 0; i < cidades.length; i++) {
			System.out.println("Cidade " + (i+1));
			aux = obj_in.nextLine();
			cidades[i] = aux;
		}
		
		Arrays.sort(cidades);
		
		System.out.println("-----------------------");
		System.out.println("Cidades ordenadas: ");
		for (int i = 0; i < cidades.length; i++) {
			System.out.print(cidades[i] + " - ");
		}
		
		
		String[] invertido = new String[4];
		for (int i = 0; i < cidades.length; i++) {
			invertido[(cidades.length - i) - 1] = cidades[i];
		}
		System.out.println("-----------------------");
		System.out.println("Array invertido: ");
		for (int i = 0; i < invertido.length; i++) {
			System.out.print(invertido[i] + " - ");
		}
		
		obj_in.close();
		
	}
	
	public int desafio8(String[] array, String text) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].equals(text)) {
				return i + 1;
			}
		}
		return 0;
	}
	
	
}
