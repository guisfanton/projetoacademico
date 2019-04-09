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
public class ProgramaTeste2 {

    public static void main(String[] args) {
        Professor coelho;

        String[] areas = {"Programação de Computadores", "Redes de Computadores", "Segurança de Sistemas"};

        coelho = CriaObjetos.CriarProfessor("Rafael Vieira Coelho", 1804250, areas);

        System.out.println(coelho.getNome());
    }


}
