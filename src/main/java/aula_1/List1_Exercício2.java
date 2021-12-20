package aula_1;

import java.util.Scanner;

public class List1_Exercício2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        int p;

        System.out.print("informe um numero: ");
        m = sc.nextInt();

        System.out.print("Informe um numero para multiplicar: ");
        p = sc.nextInt();

        for(int i = 0; i <= p; i++){
                System.out.println(m*i);
        }
    }
}


