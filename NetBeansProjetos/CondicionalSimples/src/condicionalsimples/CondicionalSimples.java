/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalsimples;

import java.util.Scanner;

/**
 *
 * @author Marcela
 */
public class CondicionalSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ESTRUTURA CONDICIONAL SIMPLES
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota 1:");
        float n1 = teclado.nextFloat();
        System.out.print("Nota 2:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua média foi "+ m);
        if (m>=9){
            System.out.println("PARABÉNS, não fez mais que sua obrigaçãokkk");
            
        }
    }
    
}
