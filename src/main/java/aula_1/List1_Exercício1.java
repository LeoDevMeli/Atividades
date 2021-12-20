package aula_1;

import java.util.Scanner;

public class List1_Exercício1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int NumPar;

        System.out.print("Digite um numero: ");
        NumPar = sc.nextInt();

        for (int i = 0; i <= NumPar; i++) {
            if (NumPar % 2 == 0) {
                System.out.println(i++);
            }
        }
    }
}


