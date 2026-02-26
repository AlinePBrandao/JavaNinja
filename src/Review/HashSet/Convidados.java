package Review.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Convidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> convidados = new HashSet<>();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("----- Opções -----");
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Ver lista de convidados");
            System.out.println("3. Ver quantidade total");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o noem do convidado: ");
                    String nome = sc.nextLine();
                    convidados.add(nome);
                    System.out.println("Convidado adicionado");
                    break;
                case 2:
                    System.out.println("Lista de convidados: " + convidados);

                    //NOTE: caso fosse necessário um for
//                    for (String convidado : convidados){
//                        System.out.println(convidado);
//                    }
                    break;
                case 3:
                    System.out.println("Quantidade de convidados: " + convidados.size());
                    break;
                case 4:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        }

        sc.close();
    }
}
