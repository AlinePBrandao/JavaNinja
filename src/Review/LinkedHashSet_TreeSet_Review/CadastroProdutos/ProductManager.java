package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProductManager {

    LinkedHashSet<Product> productsHashSet = new LinkedHashSet<>(); //NOTE: ordem de inserção
    TreeSet<Product> productsTreeSet = new TreeSet<>();//NOTE: ordenados por nome

    public void adicionarProduto(String nome, double preco){
        Product produto = new Product(nome, preco);
        productsHashSet.add(produto);
        productsTreeSet.add(produto);
    }


}
