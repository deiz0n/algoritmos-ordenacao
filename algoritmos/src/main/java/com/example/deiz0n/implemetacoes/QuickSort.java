package com.example.deiz0n.implemetacoes;

import java.util.Arrays;

public class QuickSort {

    static int particao(int[] lista, int inicio, int fim) {
        int pivo = lista[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (lista[j] <= pivo) {
                i +=1;
                int aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
            }
        }
        int aux = lista[i + 1];
        lista[i + 1] = lista[fim];
        lista[fim] = aux;
        return i + 1;
    }

    static String quickSortImpl(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int posicao = particao(lista, inicio, fim);
            quickSortImpl(lista, inicio, posicao - 1);
            quickSortImpl(lista, posicao + 1, fim);
        }
        return Arrays.toString(lista);
    }

    public static void main(String[] args) {
        
        String impl = quickSortImpl(Lista.getLista, 0, Lista.getLista.length - 1);

        System.out.println(impl);
    }
}


