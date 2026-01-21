package Intermediario.HerancaECia;

public class Uzumaki extends Ninja implements SharinganInterface{

    public void modoSabioAtivado(){
        System.out.println("Meu nome é " + nome + ". Modo Sábio Ativado!");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativou!");
    }
}
