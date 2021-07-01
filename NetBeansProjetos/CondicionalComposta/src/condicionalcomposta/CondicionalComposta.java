/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalcomposta;

import java.util.Scanner;

/**
 *
 * @author Marcela
 */
public class CondicionalComposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu ano de nascimento:");
        int ncs = t.nextInt();
        int i = 2021 - ncs;
        System.out.println("Sua idade é " +i);
        if (i >+18){
            System.out.println("Voce é maior de idade");
        }else{
            System.out.println("Voce é menor de idade");
        }
    }
    
}
