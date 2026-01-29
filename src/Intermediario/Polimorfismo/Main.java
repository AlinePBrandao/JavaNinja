package Intermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //NOTE: objeto criado usando o consructor com argumentos
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 15, NivelNinja.GENIN, Bijus.KURAMA);
        naruto.informacoesNinjaUzumaki();
        System.out.println("Minha Biju é " + naruto.bijus);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        System.out.println("-------------------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.informacoesNinja();
        sasuke.habilidadeEspecial();
        sasuke.sharinganAtivado();

        System.out.println("-------------------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 50, NivelNinja.JOUNNIN);
        itachi.informacoesNinja();
        itachi.habilidadeEspecial();

        System.out.println("-------------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.informacoesNinja();
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(155);

        System.out.println("-------------------------");

        System.out.println();
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Anbu";
        System.out.println(ninjaAnbu.nome);

        System.out.println("-------------------------");
    }
}
