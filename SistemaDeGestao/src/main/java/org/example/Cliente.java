package org.example;

public class Cliente {
    private String nome;
    private int idade;
    private String email;

    public Cliente(int idade, String nome, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public String getNome {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade {
        return idade;
    }
    @Override
    public String toString() {
        return "Cliente [Idade=" + idade + ", Nome=" + nome + ", E-mail=" + email + "]";
    }
}