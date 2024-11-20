package com.example.deiz0n.implemetacoes;

import java.util.Arrays;

public class ShellSort {
    
    static String shellSortImpl(int[] lista) {
        int intervalo = Math.round(lista.length / 2);
        
        while (intervalo > 0) {
            for (int i = intervalo; i < lista.length; i++) {
                int temp = lista[i];
                int j = i;
                while (j >= intervalo && lista[j - intervalo] > temp) {
                    lista[j] = lista[j - intervalo];
                    j -= intervalo;
                }
                lista[j] = temp;
            }
            Math.round(intervalo /= 2);
        }

        return Arrays.toString(lista);
    }

    public static void main(String[] args) {
        int[] listaAleatoria = Lista.getLista;

        System.out.println(
            shellSortImpl(listaAleatoria)
        );
    }

}
