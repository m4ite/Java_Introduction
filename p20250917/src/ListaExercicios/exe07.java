package ListaExercicios;

public class exe07 {
	public void imprimirSalario(float ValorHora, int QtdHoras) {
		double salario = ValorHora * QtdHoras;
		double desconto;
		
		if(salario <= 900) {
			desconto = 0;
		} else if (salario > 900 && salario <= 1500) {
			desconto = salario * 0.05;
		} else if (salario > 1500 && salario <= 2500) {
			desconto = salario * 0.1;
		} else {
			desconto = salario * 0.2;
		}
		
		
		double inss = salario * 0.10;
        double fgts = salario * 0.11;
        double totalDescontos = desconto + inss;
        double salarioLiquido = salario - totalDescontos;
        
        System.out.printf("Salário Bruto: (%.0f * %d): R$ %.2f%n", ValorHora, QtdHoras, salario);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f%n", (desconto == 0 ? 0 : (desconto / salario * 100)), desconto);
        System.out.printf("(-) INSS (10%%) : R$ %.2f%n", inss);
        System.out.printf("FGTS (11%%) : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);
	}
}
