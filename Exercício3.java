package FirstAtividade;


import java.util.Scanner;

public class Exercício3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o primeiro numero:");
    int n1 = sc.nextInt();

    System.out.println("Informe o segundo numero:");
    int n2 = sc.nextInt();

    System.out.println("Informe o terceiro numero:");
    int n3 = sc.nextInt();

    if(n1>n2 && n2>n1){
      System.out.println("A soma entre os maiores numeros e:" +(n1+n2));
    }
    else if(n2>n1 && n3>n2){
      System.out.println("A soma entre os maiores numeros e: "+(n2+n3));
    }
    else{
      System.out.println("A soma entre os maiores numeros e"+(n1+n3));
    }



  }
}