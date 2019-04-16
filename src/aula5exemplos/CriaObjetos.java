package aula5exemplos;

import java.util.Scanner;

public class CriaObjetos {



    public static Aluno CriarAluno(String nome, Curso curso, int anoIngresso, boolean ehFormado, long matricula){
        Aluno a = new Aluno();
        a.setNome(nome);
        a.setCurso(curso);
        a.setAnoIngresso(anoIngresso);
        a.setEhFormado(ehFormado);
        a.setMatricula(matricula);

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
        p.setNome(nome);
        p.setSiape(siape);
        p.setAreas(areas);

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


    public static Curso CriarCurso(String nome, String ppc, Disciplina disciplina){
        Professor p = new Professor();
        p.setNome(nome);
        p.setSiape(ppc);
        p.setAreas(disciplina);

    }


}
