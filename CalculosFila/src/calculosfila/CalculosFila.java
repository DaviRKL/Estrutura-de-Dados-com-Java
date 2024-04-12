/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosfila;

import javax.swing.JOptionPane;

/**
 *
 * @author 0031432412026
 */
public class CalculosFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila F = new Fila(4);
        int num;
        int op;
        for (int i = 0; i < 4; i++) {
            num = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Informe um número inteiro a ser inserido na fila:"));
            F.enfileirar(num);

        }
            F.MaiorNumero();
            F.MenorNumero();
            F.Media();

    }

}
