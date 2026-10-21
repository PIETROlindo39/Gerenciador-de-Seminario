package Test;

import dominio.Alunos;
import dominio.Local;
import dominio.Professor;
import dominio.Seminario;

public class Escola {
    public static void main(String[] args){
        Local local = new Local("Rua do Sese");
        Alunos alunos = new Alunos("Pietro",15);
        Professor professor = new Professor("Fabiano", "História");
        Alunos[] alunosSem = {alunos};
        Seminario seminario = new Seminario("Seminario de História", alunosSem, local);
        Seminario[] seminarioDisponivel ={seminario};
        professor.setSeminario(seminarioDisponivel);
        professor.impressora();


    }
}
