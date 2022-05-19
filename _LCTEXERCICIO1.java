

import java.util.Scanner;

public class _LCTEXERCICIO1 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

      int idade;

      System.out.printf("Informe a idade da pessoa: ");
      idade = ler.nextInt();

      if (idade < 16)
         System.out.printf("\nNao pode votar.\n");
      else if ((idade >= 18) && (idade <= 65))
              System.out.printf("\nVoto obrigatorio.\n");
           else
              System.out.printf("\nVoto facultativo.\n");
    }

}
