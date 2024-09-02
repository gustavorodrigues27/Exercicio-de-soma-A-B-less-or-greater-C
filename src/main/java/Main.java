import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor de A:");
    int A = sc.nextInt();

    System.out.println("Digite o valor de B:");
    int B = sc.nextInt();

    System.out.println("Digite o valor de C:");
    int C = sc.nextInt();

    int soma = A + B;

    System.out.println("A soma entre A e B é: " + soma);

    if (soma > C) {
      System.out.println("A + B é maior que C");
    } else {
      System.out.println("A + B é menor que C");
    }

  }

}