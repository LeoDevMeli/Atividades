package Interface_Generics;

public class Celular implements Procedente<Celular>{

    private String numero;
    private String proprietario;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Celular(String numero, String proprietario) {
        this.numero = numero;
        this.proprietario = proprietario;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.numero.compareToIgnoreCase(celular.getNumero());
    }

    @Override
    public String toString() {
        return "Celular: " +
                "numero = " + numero +
                " proprietario = " + proprietario
                ;
    }
}
