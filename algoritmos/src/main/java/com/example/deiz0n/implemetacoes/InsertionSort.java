package com.example.deiz0n.implemetacoes;

import java.util.Arrays;

public class InsertionSort {
    
    static String insertionSortImpl(int[] lista) {
        
        for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i - 1;
            while (j >= 0 && valor < lista[j]) {
                lista[j+1] = lista[j];
                j -= 1;
            }
            lista[j+1] = valor;
        }

        return Arrays.toString(lista);
    }

    public static void main(String[] args) {
        
        int[] listaAleatoria = Lista.getLista;

        System.out.println(
            insertionSortImpl(listaAleatoria)
        );

    }
}
