package Intermediario.Generics.SemGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {

    private List<Kunai> kunais;

    //NOTE: Constructor sem List como parâmetro
    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    public void adicionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais.toString();
    }
}
