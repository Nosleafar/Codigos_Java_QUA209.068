package entities;

import java.util.Scanner;

public class email {
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void printEmail() {
        System.out.println(getEmail());
        System.out.println("****");
    }
}

