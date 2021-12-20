package aula_1;

import java.util.Scanner;

public class List1_Exercício4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int ent = input.nextInt();

        for(int i=1; i < ent; i++){
            if(ehPrimo(i)){
                System.out.printf("%d\n", i);
            }
        }
    }

    public static boolean ehPrimo(int isPrimo) {
        if (isPrimo == 0 || isPrimo == 1) {
            return false;
        } else {
            int fim = (int)Math.sqrt(isPrimo);
            for (int i = 2; i < fim; i++) {
                if (isPrimo % i == 0) {
                    return false;
                }
            }
        }return true;
    }
}

