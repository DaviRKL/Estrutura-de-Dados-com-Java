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
public class Fila {
    
    private int tamanho;
    private int inicio;
    private int fim;
    private int total;
    private int vetor[];
    private int tamanhoPreenchido;

    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        vetor = new int[tam];
        tamanho = tam;
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

    public int verificaTamanho() {
        for (int i = 0; i < total; i++) {
            tamanhoPreenchido++;
        }
        return tamanhoPreenchido;
    }
    
}
