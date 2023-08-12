import java.util.*;

public class day1 {
  public static void main(String[] args) {


    int soma, num1, num2, lastn;
    Scanner scanner = new Scanner(System.in);


    System.out.println("Digite o tamanho do array");
    int arraysize = scanner.nextInt();
    int[] arraynum = new int[arraysize];


    for (int i = 0; i < arraysize; i++) {
      arraynum[i] = scanner.nextInt();
    }

    lastn = arraynum.length;
    num1 = arraynum[0];
    num2 = arraynum[lastn - 1];
    soma = num1 + num2;
    System.out.println(soma);

    scanner.close();
  }
}
