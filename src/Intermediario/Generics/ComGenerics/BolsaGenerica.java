package Intermediario.Generics.ComGenerics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica <T>{
    //NOTE: para transformar uma classe em genérica adicionar <> e o tipo recebido, T = Type

    private List<T> equipamentos;

    //NOTE: Constructor sem parametro List
    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //NOTE: Colocar equipamentos Genéricos
    public void adicionarEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
