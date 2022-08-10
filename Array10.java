package br.com.impacta.arrays;

import javax.swing.*;

public class Array10 {
    public static void main(String[] args) {
        /*Faça um programa para ler dois arrays A e B,
         * pergunte ao usuário a quantidade do array e
         * os valores de cada array,
         * Em seguida, gere um terceiro array C, onde
         * cada elemento de C é a soma dos elementos
         * correspondentes de A e B.
         * Imprima o array C gerado */

        int quantidade = Integer.parseInt
                (JOptionPane.showInputDialog
                        ("Informe a quantidade de números"));

        int[] A = new int[quantidade];
        int[] B = new int[quantidade];
        int[] C = new int[quantidade];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Array A - Informe o número: " + (i + 1)));
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(JOptionPane.showInputDialog
                    ("Array B - Informe o número: " + (i + 1)));
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }
        for (int numeroAtual : C) {
            System.out.println("Valores C" + numeroAtual);
        }
    }
}
