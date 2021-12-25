package Interface_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desenvolvimento_Exercicio {

    public static void main(String[] args) {

        Procedente p1 = new Pessoa("Luis", "487.948.222-19");
        Procedente p2 = new Pessoa("Leo", "133.555.341-88");
        Procedente p3 = new Pessoa("Luiza", "451.111.678-12");

        List<Procedente> pessoa = new ArrayList<Procedente>();
        pessoa.add(p1);
        pessoa.add(p2);
        pessoa.add(p3);

        Procedente<Pessoa> pessoas[] = ShotUtil.sort(pessoa.toArray(new Procedente[0]));

        Arrays.stream(pessoas).forEach(System.out::println);

        Procedente c1 = new Celular("111376822", "Lucas");
        Procedente c2 = new Celular("989044321", "Pedro");
        Procedente c3 = new Celular("989056789", "Igor");

        List<Procedente> celular = new ArrayList<Procedente>();
        celular.add(c1);
        celular.add(c2);
        celular.add(c3);

        Procedente<Celular> celulares[] = ShotUtil.sort(celular.toArray(new Procedente[0]));

        Arrays.stream(celulares).forEach(System.out::println);
    }
}
