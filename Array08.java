package br.com.impacta.arrays;

import javax.swing.*;

public class Array08 {
    public static void main(String[] args) {
        /*Faça um programa que pergunte ao usuário a
         * quantidade do array, depois informe qual
         * o valor em cada posição, em seguida, mostre
         * na tela todos os números pares, e também a
         * quantidade de números pares. */

        int quantidade = Integer.parseInt
                (JOptionPane.showInputDialog
                        ("Informe a quantidade de números"));

        int [] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Informe o número: " + i+1));
        }
        int quantidadePar = 0;

        for (int numeroAtual : numeros){
            if (numeroAtual % 2 == 0){
                quantidadePar++;
                System.out.println("Número par: " + numeroAtual);
            }
        }
        System.out.println("Quantidade de pares é: " + quantidadePar);
    }
}
