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
public class Fila {
    
    private int tamanho;
    private int inicio;
    private int fim;
    private int total;
    private int vetor[];
    private int maiorValor;
    private int menorValor;
    private int media;
    private int somaNumeros;

    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        vetor = new int[tam];
        tamanho = tam;
        maiorValor = 0;
        menorValor = 10000000;
        media = 0;
        somaNumeros = 0;
    }

    public boolean vazia() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cheia() {
        if (total >= tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public void enfileirar(int elem) {
        if (!cheia()) {
            vetor[fim] = elem;
            fim++;
            total++;
//            if(fim>= tamanho)
//                fim= 0;
//            
        } else {
            System.out.println("Fila cheia");
        }
    }
    
    public void MaiorNumero(){
         for (int i = 0; i < total; i++) {   
             if(maiorValor <= vetor[i]){
                 maiorValor = vetor[i];
             }
        }
        JOptionPane.showMessageDialog(null,"O maior valor é: " + maiorValor);
    }
    public void MenorNumero(){
         for (int i = 0; i < total; i++) {   
             if(menorValor >= vetor[i]){
                 menorValor = vetor[i];
             }
        }
        JOptionPane.showMessageDialog(null, "O menor valor é: " + menorValor);
    }
    public void Media(){
         for (int i = 0; i < total; i++) {   
             somaNumeros+= vetor[i];
             media = somaNumeros/total;
        }
        JOptionPane.showMessageDialog(null, "A media é: " + media);
    } 
}
