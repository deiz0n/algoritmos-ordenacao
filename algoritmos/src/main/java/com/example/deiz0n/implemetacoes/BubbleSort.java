package com.example.deiz0n.implemetacoes;

import java.util.Arrays;

public class BubbleSort {
    

    static String BubbleSortImpl(int[] lista) {

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++) {   
                if (lista[j] > lista[j+1]) {
                    int valor = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = valor;
                }
            }
        }
        
        return Arrays.toString(lista);
    }

    public static void main(String[] args) {
        
        int[] listaAleatoria = Lista.getLista;
        
        System.out.println(
            BubbleSortImpl(listaAleatoria)
        );

    }
}
