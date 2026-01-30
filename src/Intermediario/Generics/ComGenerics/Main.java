package Intermediario.Generics.ComGenerics;

public class Main {
    public static void main(String[] args) {

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
