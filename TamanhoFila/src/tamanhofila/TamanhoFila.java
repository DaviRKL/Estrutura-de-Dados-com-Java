/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamanhofila;

import javax.swing.JOptionPane;

/**
 *
 * @author 0031432412026
 */
public class TamanhoFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila F1 = new Fila(10);
        Fila F2 = new Fila(10);
        int tamanhoF1 = 1;
        int tamanhoF2 = 1;
        int numF1;
        int numF2;
        int op;
          do {
                numF1 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe um número inteiro a ser inserido na fila 1 ou 0 para parar de informar numeros:"));
                if(numF1 != 0){  
                    F1.enfileirar(numF1);
                }
            } while (numF1!=0);
//        for (int i = 0; i < 3; i++) {
            do {
                numF2 = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe um número inteiro a ser inserido na fila 2 ou 0 para parar de informar numeros:"));
                if(numF2 != 0){  
                    F2.enfileirar(numF2);
                }
            } while (numF2!=0);
//        }
        if( F1.verificaTamanho() > F2.verificaTamanho()){
            JOptionPane.showMessageDialog(null, "A fila 1 é maior que a fila 2");
        }else{
            JOptionPane.showMessageDialog(null, "A fila 2 é maior que a fila 1");
        }
       
    }

}
