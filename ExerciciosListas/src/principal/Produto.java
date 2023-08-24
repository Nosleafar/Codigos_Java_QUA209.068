package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entities.especificações;
import entities.pessoal;

public class Produto {

    public static void main(String[] args) {

        ArrayList<String> dados = new ArrayList<>();
          Scanner sc = new Scanner(System.in);
   {
            System.out.println("Digite o nome do Produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite a quantidade do Produto: ");
            double quantidade = sc.nextDouble();
            System.out.println("Digite o valor: ");
            int valor = sc.nextInt();
            System.out.println("Digite o nome do Produto: ");
            String nome2 = sc.nextLine();
            System.out.println("Digite a quantidade do Produto: ");
            double quantidade2 = sc.nextDouble();
            System.out.println("Digite o valor: ");
            int valor2 = sc.nextInt();
            System.out.println("Digite o nome do Produto: ");
            String nome3 = sc.nextLine();
            System.out.println("Digite a quantidade do Produto: ");
            double quantidade3 = sc.nextDouble();
            System.out.println("Digite o valor: ");
            int valor3 = sc.nextInt();
            
            
        }

        Collections.sort(dados);

        
		for (especificações produto::especificações) {
            System.out.println(dados);
        }
    }
}
