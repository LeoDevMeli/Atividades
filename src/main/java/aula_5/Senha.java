package aula_5;

import java.util.regex.Pattern;

public class Senha {

    public String value;
    public Pattern pattern;

    public Senha(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setValue(String value) {
        try {
            if (pattern.matcher(value).find()) {
                this.value = value;
                System.out.println(this.getClass().getName() + "  " +"Senha cadastrada com sucesso  =]");
            } else {
                throw new Exception("A senha informada nao confere com as regras especificadas,  tente novamente");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + this.getClass().getName() +"   " + e.getMessage());
        }
    }
}

