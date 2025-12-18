package Intermediario.Desafio3;


public class Program {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "recuperar o amuleto";
        sasuke.nivelDificuldade = "alta";
        sasuke.statusMissao = "em andamento";

        sasuke.mostrarInformacoes();

    }
}
