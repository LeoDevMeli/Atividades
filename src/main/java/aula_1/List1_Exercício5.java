package aula_1;

import java.util.Scanner;

public class List1_Exercício5 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.print("Informe o 1º número: ");
        int n = ent.nextInt();

        System.out.print("Informe o 2º número: ");
        int m = ent.nextInt();

        System.out.print("Informe o 3º número: ");
        int d = ent.nextInt();

        int qtdNumsInt = 0;
        int num = 0;

        while (qtdNumsInt < n) {
            num++;

            String numString = String.valueOf(num);
            int totalNumerosString = 0;

            for (int i = 0; i < numString.length(); i++) {
                if (Character.toString(numString.charAt(i)).equals(String.valueOf(d))) {
                    totalNumerosString++;
                }
                if (totalNumerosString == m) {
                    System.out.println(numString);
                    qtdNumsInt++;
                    break;
                }
            }
        }
    }
}
