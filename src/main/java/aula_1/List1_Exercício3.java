package aula_1;

import java.util.Scanner;

public class List1_Exercício3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int isPrimo = input.nextInt();

            if (( isPrimo % 2 != 0 ) && ( isPrimo %3 !=0 )) {
                System.out.println("O numero digitado é primo");
            } else {
                System.out.println("O numero digitado nao é primo");
        }
    }
}
