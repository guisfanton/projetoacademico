/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;

import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = s.nextInt();
        s.nextLine();
        if (opcao == 1) {
            CriaObjetos.PedirCriarProfessor();
        } else {
            CriaObjetos.PedirCriarAluno();
        }
    }
}
