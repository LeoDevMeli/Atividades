package aula_2;

import java.math.BigDecimal;

public class Lista2_Exercicio2 {
    public  static  void  main ( String [] args ) {

        BigDecimal valorEmpreX =  new  BigDecimal ( 1130000 );
        double porcCresEmpX =  1.48;

        BigDecimal valorEmpY =  new  BigDecimal ( 18400000 );
        double porcCrescEmpY =  0.32 ;

        int year =  2021 ;

        while (valorEmpreX.compareTo (valorEmpY) <  0 ) {
            year ++ ;

            valorEmpreX = valorEmpreX.add ( new  BigDecimal (porcCresEmpX).multiply(valorEmpreX));
            valorEmpY = valorEmpY.add ( new  BigDecimal (porcCrescEmpY).multiply(valorEmpY));

            System.out.println( " Empresa X -  01/01 / " + year +  " - Valor da empresa: "  +  String.format( "%.2f\n", valorEmpreX.doubleValue() / 1000000 ));
            System.out.print( " Empresa Y -  01/01 / " + year +  " - Valor da empresa: "  +  String.format( "%.2f\n", valorEmpY.doubleValue() / 1000000 ));

        }
    }
}
