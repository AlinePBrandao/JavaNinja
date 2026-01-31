package Intermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {
    //NOTE: Por padrão o Record já retorna construtores e getters, toString, etc
    //NOTE: Todos os atributos são Final por padrão

    //NOTE: É possível criar métodos dentro de Recordd
    public String emailMaiusculo(){
        return email.toUpperCase();
    }
}
