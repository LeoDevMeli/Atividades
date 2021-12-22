package aula_4;

public class Turma {

    private String serie;
    private String codigo;
    private Disciplina[] disciplina;
    private Estudante[] estudante;

    public Turma() {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.estudante = estudante;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }
}
