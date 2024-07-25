package src;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numero = {10, 9, 2, 4, 5 ,13};

        for (int i = 0; i < numero.length; i++) {
            int menorNumero = i;
            int ordenandoArray = numero[i];

            for (int j = i+1; j < numero.length; j++) {
                if (numero[j] < numero[i]) {
                    numero[i] = numero[j];
                    menorNumero = j;
                }
            }
            numero[menorNumero] = ordenandoArray;
        }

        Arrays.stream(numero).forEach(System.out::println);
    }
}
