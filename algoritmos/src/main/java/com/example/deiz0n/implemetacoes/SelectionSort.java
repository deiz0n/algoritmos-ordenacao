package com.example.deiz0n.implemetacoes;

import java.util.Arrays;

public class SelectionSort {
        
    static String selectionSortImp(int[] lista) {

        for (int i = 0; i < lista.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[minimo] > lista[j]) {
                    minimo = j;
                }
            }

            int temp = lista[i];
            lista[i] = lista[minimo];
            lista[minimo] = temp;
        }

        return Arrays.toString(lista);
    }


    public static void main(String[] args) {
        
        int[] listaAleatoria = Lista.getLista;

        System.out.println(
            selectionSortImp(listaAleatoria)
        );

    }
}
