package Review.LinkedHashSet_TreeSet_Review.CadastroProdutos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProductManager {

    LinkedHashSet<Product> productsLinkedHashSet = new LinkedHashSet<>(); //NOTE: ordem de inserção
    TreeSet<Product> productsTreeSet = new TreeSet<>();//NOTE: ordenados por nome

    public void adicionarProduto(String nome, double preco){
        Product product = new Product(nome, preco);
        productsLinkedHashSet.add(product);
        productsTreeSet.add(product);
    }

    public void mostrarProdutoInsercao(){
        System.out.println("Produtos na ordem de inserção: ");
        for (Product product : productsLinkedHashSet){
            System.out.println(product);
        }
    }

    public void mostrarProdutoOrdenado(){
        System.out.println("Produtos ordenados por nome: ");
        for (Product product : productsTreeSet){
            System.out.println(product);
        }
    }
}
