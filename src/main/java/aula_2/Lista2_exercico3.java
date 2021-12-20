package aula_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lista2_exercico3 {

    public static class Produto{

        public String item;
        public BigDecimal value;
        public int qtd;

        public Produto(String item, BigDecimal value, int qtd) {
            this.item = item;
            this.value = value;
            this.qtd = qtd;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produto[] compra = new Produto[3];
        BigDecimal compraFinal = BigDecimal.valueOf(0);

        try {
            for (int i = 0; i < compra.length; i++) {
                System.out.println("Digite o nome de item: ");
                String item = input.next();

                System.out.println("Digite o valor do item: ");
                BigDecimal value = input.nextBigDecimal();

                System.out.println("Digite a quantidade do  item: ");
                int qtd = input.nextInt();

                compra[i] = new Produto(item, value, qtd);
                compraFinal = (BigDecimal.valueOf(qtd).multiply(value));
            }


            for (Produto produto : compra) {
                System.out.println("Produto " + produto);
                System.out.println();
                System.out.println("Item " + produto.item);
                System.out.println("R$ " + produto.value);
                System.out.println("Quantidade:  " + produto.qtd);
            }

            }catch(Exception ex){

                System.out.println("Verifique dados digitados, algum dado nao esta de acordo com o solicitado!");
            }

        System.out.println();
        System.out.println("Valor Total: " + compraFinal);

    }
}
