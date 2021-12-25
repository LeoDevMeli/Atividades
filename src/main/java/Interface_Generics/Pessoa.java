package Interface_Generics;

public class Pessoa implements Procedente<Pessoa>{
String nome;
String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.nome.compareToIgnoreCase(pessoa.getNome());
    }

    @Override
    public String toString() {
        return "Pessoa: " +
                "nome = " + nome +
                ", cpf = " + cpf
                ;
    }
}
