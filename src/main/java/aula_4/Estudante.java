package aula_4;

import java.time.LocalDate;

public class Estudante {

    private String nomeEstudante;
    private LocalDate dataNascimento;
    private int numMatricula;
    private String serie;

    public Estudante() {
        this.nomeEstudante = nomeEstudante;
        this.dataNascimento = dataNascimento;
        this.numMatricula = numMatricula;
        this.serie = serie;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
