package Review.GenericsReview;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Warehouse<Product> productWarehouse = new Warehouse<>();
        Product lapis = new Product("Lápis", 2.50);
        Product caderno = new Product("Caderno", 12.00);
        Product mochila = new Product("Mochila", 89.90);


    }
}
