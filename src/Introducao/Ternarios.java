package Introducao;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de missões concluídas: ");
        short numeroMisspes = sc.nextShort();

        String nivelNinja = (numeroMisspes >=10) ? "Esse ninja tem mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelNinja);
        sc.close();
    }
}
