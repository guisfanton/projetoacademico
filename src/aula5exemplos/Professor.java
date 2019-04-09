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
public class Professor {

    private String nome;
    private String areas[];
    private long siape;

    public String getNome() {
        return nome;
    }

    public String[] getAreas() {
        return areas;
    }

    public long getSiape() {
        return siape;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
    }

    public void setSiape(long siape) {
        this.siape = siape;
    }




    void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    boolean novaArea(String area) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == null) {
                areas[i] = area;
                return true;
            }
        }
        return false;
    }
    
    boolean removerArea(String area) {
        for (int i = 0; i < areas.length; i++) {
            if (areas[i].equals(area)) {
                areas[i] = null;
                return true;
            }
        }
        return false;
    }
}
