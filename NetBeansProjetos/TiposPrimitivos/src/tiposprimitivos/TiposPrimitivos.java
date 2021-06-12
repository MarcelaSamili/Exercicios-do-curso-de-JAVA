/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Marcela
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SAIDA DE DADOS
        /**String nome = "Marcela";
        *float nota = 8.5f;
        *System.out.println("A nota é " + nota);
        *System.out.printf("A nota de %s é %.2f \n", nome, nota);
        *System.out.format("A nota de %s é %.2f \n", nome, nota); */
        //ENTADA DE DADOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota:");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    
    }
    
}
