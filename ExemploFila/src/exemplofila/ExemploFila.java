/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplofila;

import javax.swing.JOptionPane;

/**
 *
 * @author 0031432412026
 */
public class ExemploFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila F = new Fila(10);
        int num;
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                        "1 - Inserir um elemento na Fila \n" +
                        "2 - Remover um elemento da Fila\n" +
                        "3 - Exibir os elementos da Fila\n" +
                        "4 - Sair\n" +
                        "Informe a opção desejada:"));
            switch(op)
            {   
                case 1: 
                    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informee um número inteiro a ser inserido na fila ")); 
                    F.enfileirar(num);
                break;
                
                case 2:
                    JOptionPane.showMessageDialog(null, "Valor desenfileirado: " + F.desenfileirar());
                break;
                
                case 3:
                    F.exibeFila();
                break;
                
                case 4:
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
                   
            }
        }while (op!=4);
        for(int i=0; i<10; i++){
            num = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Informe um número inteiro a ser inserido na fila:"));
            F.enfileirar(num);
            
        }
        F.exibeFila();
    }
    
}
