/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;

/**
 *
 * @author coelho
 */
public class Aluno {

    private String nome;
    private String curso;
    private int anoIngresso;
    private boolean ehFormado;
    private long matricula;


    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public boolean getEhFormado() {
        return ehFormado;
    }

    public long getMatricula() {
        return matricula;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setEhFormado(boolean ehFormado) {
        this.ehFormado = ehFormado;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }



    String verificaStatus() {
        if (ehFormado) {
            return "O aluno ainda não completou os créditos";
        }
        return "O aluno entrou no ano" + anoIngresso + "e se formou";
    }

    long obtemMatricula() {
        return matricula;
    }
}
