package Intermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        //NOTE: Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        naruto.informacoesNinjaUzumaki();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        //NOTE: Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.informacoesNinja();
        sasuke.habilidadeEspecial();

        //NOTE: objeto criado usando o consructor com argumentos
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 50, NivelNinja.JOUNNIN);
        itachi.informacoesNinja();
        itachi.habilidadeEspecial();

        //NOTE: sobrecarga de construtores
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.informacoesNinja();
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(155);
    }
}
