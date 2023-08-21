package principal;

import java.util.Scanner;
import entities.email;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        email email = new email();
        System.out.println("Digite seu email: ");
        email.setEmail(sc.nextLine());
        
        System.out.println("Agora, digite sua senha: ");
        email.setSenha(sc.nextLine());

        if (!email.getSenha().equals("1234")) {
            System.out.println("Senha incorreta, digite novamente");
        } else {
            System.out.println("Agora você tem acesso ao seu email");
        }

        email.changePassword(sc);
        email.printEmail();
    }
}
