package Introducao;

public class Arrays2D {
    public static void main(String[] args) {

        String[][] narnia = new String [3][3];

        narnia[0] [0] = "Narnia";
        narnia[0] [1] = "Gregório";
        narnia[0] [2] = "Poly";

        narnia[1] [0] = "Cair Para Véu";
        narnia[1] [1] = "Pedro";
        narnia[1] [2] = "Suzana";

        narnia[2] [0] = "País de Aslan";
        narnia[2] [1] = "Aslan";
        narnia[2] [2] = "Ripchip";

        for (int i = 0; i<narnia.length; i++){
            System.out.println("País: " + narnia[i][0]);
            for (int j = 1; j<narnia[i].length; j++) {
                System.out.println("Pessoa: " + narnia[i][j]);
            }
        }
    }
}