
public class Array01 {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 20;
        numeros[1] = 10;
        numeros[2] = -12;
        numeros[3] = 0;
        numeros[4] = 8;
        /* O for mais utilizado seria:
        for (int i = 0; i <= numeros.legth-1; i++)*/
        for (int i = 0; i <= 4 ; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println();
        /* O for mais utilizado seria:
        for (int i = numeros.legth-1; i >= 0; i--)*/
        for (int i = 4; i >= 0 ; i--) {
            System.out.println(numeros[i]);
        }
    }
}