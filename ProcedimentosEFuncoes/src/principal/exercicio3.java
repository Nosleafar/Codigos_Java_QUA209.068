package principal;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Fa�a um programa que receba o salario e a quantidade de venda total que o vendedor fez
		//no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5% de inss e 11% de IRPF
		//sobre o salario bruto.

		//Se o vendedor possui o total de venda acima de 20 mil no m�s, ele recebe uma bonifica��o
		//de 5% sobre o valor das vendas;

		//Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma bonifica��o de
		//3% no valor da venda;

		//Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma bonifica��o de
		//1% no valor da venda;

		//Se o valor n�o passar de 10 mil, imprima uma frase motivacional;

		
	System.out.println("Digite o valor do seu Sal�rio: ");
	double salario = sc.nextDouble();
	System.out.println("Agora, digite o valor total das vendas: ");
	double venda = sc.nextDouble();
	
			if (venda>20000) {
				System.out.printf("Parab�ns, o seu sal�rio foi de: %.2 reais ", reais(salario,venda));
			}else if(venda>15000 && venda<20000) { 
				System.out.printf("Parab�ns, o seu sal�rio foi de:  %.2 reais", reais(salario,venda));
			}else if (venda>10000&&venda<15000) {
			System.out.printf("Parab�ns, o seu sal�rio foi de:  %.2 reais", reais(salario,venda));
			}else{
			}System.out.println("Parab�ns pelos resultados obtidos, continue se empenhando");
			
		
		sc.close();
	}
		
	static double reais(double salario, double venda) {
		return salario+ venda;
		
		
	}

}
