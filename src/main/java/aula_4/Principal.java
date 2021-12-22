package aula_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Estudante> std = new ArrayList<>();
        Estudante estudante = new Estudante();
        estudante.setNomeEstudante("Luiz");
        estudante.setDataNascimento(LocalDate.of(2000, 10, 12));
        estudante.setSerie("9");
        estudante.setNumMatricula(1234);
        std.add(estudante);

        Estudante estudante2 = new Estudante();
        estudante2.setNomeEstudante("Luiz");
        estudante2.setDataNascimento(LocalDate.of(2000, 10, 12));
        estudante2.setSerie("9");
        estudante2.setNumMatricula(1234);
        std.add(estudante2);

        Estudante estudante3 = new Estudante();
        estudante3.setNomeEstudante("Luiz");
        estudante3.setDataNascimento(LocalDate.of(2000, 10, 12));
        estudante3.setSerie("9");
        estudante3.setNumMatricula(1234);
        std.add(estudante3);


        List<Disciplina> dsc = new ArrayList<>();
        Disciplina disc = new Disciplina();
        disc.setNomeDisciplina("Matematica");
        disc.setCargaHorario(4);
        dsc.add(disc);

        Disciplina disc2 = new Disciplina();
        disc2.setNomeDisciplina("Logica");
        disc2.setCargaHorario(8);
        dsc.add(disc2);

        Disciplina disc3 = new Disciplina();
        disc3.setNomeDisciplina("Fisica");
        disc3.setCargaHorario(2);
        dsc.add(disc3);

        Turma t = new Turma();

        Disciplina[] disciplinas = new Disciplina[dsc.size()];
        for (int i = 0; i < disciplinas.length; i++) {
            dsc.get(i).getNomeDisciplina();
            dsc.get(i).getCargaHorario();
            disciplinas[i] = dsc.get(i);
        }

        Estudante[] estud = new Estudante[std.size()];
        for (int i = 0; i < estud.length; i++) {
            std.get(i).getDataNascimento();
            std.get(i).getNomeEstudante();
            std.get(i).getNumMatricula();
            std.get(i).getSerie();
            estud[i] = std.get(i);
        }

        t.setEstudante(estud);
        t.setDisciplina(disciplinas);

        System.out.println("----------------Inicio da aulas-------------------");

        ///jeito certo
        for (int i = 0; i < dsc.size(); i++) {
            System.out.println("Disciplina: " + t.getDisciplina()[i].getNomeDisciplina() + "  Horario da aula: " + t.getDisciplina()[i].getCargaHorario());
        }
        System.out.println("");
        for (int i = 0; i < std.size(); i++) {
            System.out.println("Nome do estudante: " + t.getEstudante()[i].getNomeEstudante() + "  Data de Nascimento: " + t.getEstudante()[i].getDataNascimento() + "  Numero da matricula: " + t.getEstudante()[i].getNumMatricula() + "  Serie: " + t.getEstudante()[i].getSerie());
        }
    }
}
