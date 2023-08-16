package principal;

import java.util.Scanner;

import entities.Idade;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	Idade idade = new Idade();
	
	System.out.println("Digite o nome da pessoa: ");
	int nome = sc.nextInt();
	System.out.println("Agora, digite o ano que" + nome + "nasceu: ");
	idade.nascimento =  sc.nextDouble();
	System.out.println("A idade de " + nome + " é de: " + idade.idade);
	}

}
