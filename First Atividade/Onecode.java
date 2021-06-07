import java.util.*;



 public class Onecode {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         System.out.println("Digite o valor: ");
         int n = scanner.nextInt();


         if (n < 0) {
             System.out.println("O valor é negativo");
         } else if (n > 0) {
             System.out.println("O valor é positivo");
         } else if (n == 0) {
             System.out.println("O valor é 0");
         }
     }
 }