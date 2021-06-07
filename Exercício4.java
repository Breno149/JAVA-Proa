package FirstAtividade;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Escolha umas das opçoes: \n" +
                "1- Soma\n" +
                "2- Subtracao\n" +
                "3- Multiplicacao\n" +
                "4- Divisao");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Digite o primeiro numero: ");
                int n1 = sc.nextInt();

                System.out.println("Digite o segundo número: ");
                int n2 = sc.nextInt();

                System.out.println("A soma dos numeros: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Digite o primeiro número: ");
                int s1 = sc.nextInt();

                System.out.println("Digite o segundo número: ");
                int s2 = sc.nextInt();

                System.out.println("A subtracao dos numeros: " + (s1 - s2));
                break;

            case 3:
                System.out.println("Digite o prineiro numero: ");
                int m1 = sc.nextInt();

                System.out.println("Digite o segubndo numero: ");
                int m2 = sc.nextInt();

                System.out.println("A multipicacao dos numeros: " + (m1 * m2));
                break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                int d1 = sc.nextInt();

                System.out.println("Digite o segundo numero: ");
                int d2 = sc.nextInt();

                System.out.println("A divisão dos numeros: " + (d1 / d2));
                break;
        }
    }
}
