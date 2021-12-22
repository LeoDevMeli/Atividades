package aula_5;

import java.util.regex.Pattern;

public class Principal {

    public static void main(String[] args) {

        //Deve conter ao menos um digito e uma letra minuscula.
        Pattern p_senhaFraca = Pattern.compile("(?=.*[0-9])(?=.*[a-z])", Pattern.CASE_INSENSITIVE);

        //Deve conter ao menos um digito, uma letra minuscula, uma letra maiuscula e um caracter especial.
        Pattern p_senhaMedia = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])", Pattern.CASE_INSENSITIVE);

        //Deve conter ao menos um digito, uma letra minuscula, uma letra maiuscula, um caracter especial, nenhum espaco em branco e pelo menos 8 caracteres
        Pattern p_senhaForte = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}", Pattern.CASE_INSENSITIVE);

        // pass
        SenhaFraca fraca = new SenhaFraca(p_senhaFraca);
        fraca.setValue("13et");

        // failed
        SenhaMedia senhaMedia = new SenhaMedia(p_senhaMedia);
        senhaMedia.setValue("44nM1");

        // failed
        SenhaForte senhaForte = new SenhaForte(p_senhaForte);
        senhaForte.setValue("1wM@123");
    }
}
