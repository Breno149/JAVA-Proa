package FirstAtividade;

import java.util.*;



public class Exercício2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.printf("Infome o primeiro número:");
        int n1 = sc.nextInt();

        System.out.printf("Infome o segundo número:");
        int n2 = sc.nextInt();

        System.out.printf("Infome o terceiro número:");
        int n3 = sc.nextInt();

        int v1 = Math.max(n1 , n2);

        int vfinal = Math.max(v1 , n3);

        System.out.println(String.format("O número maior: %s", vfinal));

    }

}
