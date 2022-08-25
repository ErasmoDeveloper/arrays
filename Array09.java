
import javax.swing.*;

public class Array09 {
    public static void main(String[] args) {
        /* Faça um programa que pergunte ao usuário a quantidade do array,
        depois informe qual o valor em cada posição, em seguida, mostre na
        tela o maior número do array(supor não haver empates).
        Mostrar também a posição do maior elemento, considerando a
        primeira posição como 0 (zero). */

        int quantidade = Integer.parseInt
                (JOptionPane.showInputDialog
                        ("Informe a quantidade de números"));

        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Informe o número: " + (i+1)));
        }
        int NumeroMaior = 0;
        int pasicaoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > NumeroMaior){
                NumeroMaior = numeros[i];
                pasicaoMaior = i;
        }
        }
        System.out.println("O maior valor é: " + NumeroMaior);
        System.out.println("A posição do maior valor: " + pasicaoMaior);
    }
}
