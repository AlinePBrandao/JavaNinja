package Intermediario.Generics.OutroGenerics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        //NOTE: superclasse Object usada para trabalhar diferentes tipos de objetos

        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do sapo"));

        System.out.println("Itens da bolsa ninja: ");
        bolsaNinja.mostrarFerramentas();
    }
}
