package ListaExercicios;

public class exe08 {
	public void imprimirReajuste(double salario) {
		double percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;

        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário, após o aumento: " + novoSalario);
	}
	
}
