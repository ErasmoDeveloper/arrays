package br.com.impacta.arrays;

import javax.swing.*;
import java.util.Arrays;

public class Array05 {
    public static void main(String[] args) {

        int quantidade = Integer.parseInt
                (JOptionPane.showInputDialog
                        ("Informe a quantidade de nomes"));

        if (quantidade <= 0) {
            JOptionPane.showMessageDialog
                    (null, "A quantidade deve ser maior que zero!",
                            "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String[] nomes = new String[quantidade];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog
                    ("Informe o Nome" + (i + 1));
        }
        Arrays.sort(nomes); //coloca os nomes em ordem alfabetica
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}