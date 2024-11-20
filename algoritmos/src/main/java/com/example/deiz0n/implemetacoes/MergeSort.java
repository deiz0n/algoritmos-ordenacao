package com.example.deiz0n.implemetacoes;

import java.util.Arrays;

public class MergeSort {

    static String mergeSortImpl(int[] lista) {
        if (lista.length > 1) {
            int divisor = lista.length / 2;
            int[] esquerda = Arrays.copyOfRange(lista, 0, divisor);
            int[] direita = Arrays.copyOfRange(lista, divisor, lista.length);

            mergeSortImpl(esquerda);
            mergeSortImpl(direita);

            int i = 0, j = 0, k = 0;

            while (i < esquerda.length && j < direita.length) {
                if (esquerda[i] < direita[j]) {
                    lista[k] = esquerda[i];
                    i += 1;
                } else {
                    lista[k] = direita[j];
                    j += 1;
                }
                k += 1;
            }
            while (i < esquerda.length) {
                lista[k] = esquerda[i];
                i += 1;
                k += 1;
            }
            while (j < direita.length) {
                lista[k] = direita[j];
                j += 1;
                k += 1;
            }
        }
        
        return Arrays.toString(lista);
    }

    public static void main(String[] args) {
        
        int[] listaAleatoria = Lista.getLista;

        System.out.println(
            mergeSortImpl(listaAleatoria)
        );

    }
    
}
