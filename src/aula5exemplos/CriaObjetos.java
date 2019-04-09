package aula5exemplos;

import java.util.Scanner;

public class CriaObjetos {



    public static Aluno CriarAluno(String nome, String curso, int anoIngresso, boolean ehFormado, long matricula){
        Aluno a = new Aluno();
        a.getNome() = nome;
        a.getCurso() = curso;
        a.getAnoIngresso() = anoIngresso;
        a.getEhFormado() = ehFormado;
        a.getMatricula() = matricula;

        return a;
    }

    public static Aluno PedirCriarAluno(){
        Scanner s = new Scanner(System.in);

        Aluno a = new Aluno();
        System.out.println("Nome:");
        a.setNome(s.nextLine());
        System.out.println("Curso:");
        a.setCurso(s.nextLine());
        System.out.println("Matricula:");
        a.setMatricula(s.nextLong());
        System.out.println("Ingresso:");
        a.setAnoIngresso(s.nextInt());
        a.setEhFormado(false);

        return a;
    }



    public static Professor CriarProfessor(String nome, long siape, String[] areas) {
        Professor p = new Professor();
        p.getNome() = nome;
        p.getSiape() = siape;
        p.getAreas() = areas;

        return p;
    }


    public static Professor PedirCriarProfessor() {
        Scanner s = new Scanner(System.in);

        Professor p = new Professor();
        System.out.println("Nome:");
        p.setNome(s.nextLine());
        System.out.println("SIAPE:");
        p.setSiape(s.nextLong());
        System.out.println("Quantas áreas?");
        int quantAreas = s.nextInt();

        String[] areas = new String[quantAreas];
        System.out.println("Informe as áreas:");
        for (int i = 0; i < quantAreas; i++) {
            areas[i] = s.nextLine();
        }
        p.setAreas(areas);

        return p;
    }


}
