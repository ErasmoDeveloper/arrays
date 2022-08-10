package br.com.impacta.arrays;

import javax.swing.*;

public class Array04 {
    public static void main(String[] args) {

        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Informe o nome: " + (i + 1));
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}