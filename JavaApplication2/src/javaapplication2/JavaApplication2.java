/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author 0031432412026
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila F = new Fila(10);
        int num;
        int op;
        do {
             num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro a ser inserido na fila "));
             if(num!=0){
                 F.enfileirar(num);
             }
                   
        } while (num != 0 && !F.cheia());
        do{
             JOptionPane.showMessageDialog(null, "Valor desenfileirado: " + F.desenfileirar());
        }while(!F.vazia());
        
    }
}


