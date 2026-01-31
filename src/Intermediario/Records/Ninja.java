package Intermediario.Records;

import java.util.Objects;

public class Ninja {

    private final String nome;
    private final String email;
    private final int telefone;

    //NOTE: Não se pode criar constructor vazio para a classe final, para seria obrigatório declarar seu valor na declaração

    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //NOTE: sem setter porque já que atributos são final, não há um novo valor para atribuir

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    //NOTE: Core class

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return telefone == ninja.telefone && Objects.equals(nome, ninja.nome) && Objects.equals(email, ninja.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, telefone);
    }

    @Override
    public String toString() {
        return "Ninja {" +
                "nome= " + nome +
                ", email= " + email +
                ", telefone= " + telefone +
                '}';
    }
}
