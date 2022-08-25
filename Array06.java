
public class Array06 {
    public static void main(String[] args) {
        /*Escreva um programa para somar os valores do array*/
        int [] n = {1,2,3,4,5,6,7,8,9,10};

        int soma = 0;

        for (int numeroAtual : n) {
            soma = soma + numeroAtual;
        }
        System.out.println("A soma de todos os valores: " + soma);
    }
}
