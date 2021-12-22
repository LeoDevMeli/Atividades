package aula_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadioxSort {

    public static void main(String[] args) {

        int iArr [] = {162233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i: iArr) {
           System.out.println(i + "  ");
        }

   }

    private static void radixSort(int[] iArr) {
      int maior = pegaMaiorNumero(iArr);
      int incluizeros = String.valueOf(maior).length();

      List<String> listZeroStr = incluiZero(iArr , incluizeros);



    }

    private static List<String> incluiZero(int[] iArr, int incluizeros) {
        List<String> iArrString = new ArrayList<>();
        for (int i = 0; i < iArr.length; i++) {
            String Zero = "%0" + incluizeros + "d";
            String comZeros = String.format(Zero, iArr[i]);
            iArrString.add(comZeros);
        }
        return iArrString;
    }

    private static int pegaMaiorNumero(int[] iArr) {
        Arrays.sort(iArr);
        int maior = Arrays.stream(iArr).max().getAsInt();
        return maior;
    }

}
