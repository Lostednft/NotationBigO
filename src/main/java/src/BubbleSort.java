package src;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {

        int[] tabela = {3, 1, 10, 2, 5, -1, 7, -4};

        for (int i = 0; i < tabela.length-1; i++) {
            int ordernandoTabela;

            for (int j = 1; j < tabela.length; j++) {
                int indice = j - 1;

                if(tabela[indice] > tabela[j]) {
                    ordernandoTabela = tabela[indice];
                    tabela[indice] = tabela[j];
                    tabela[j] = ordernandoTabela;
                }
            }
        }
        List<Integer> lista = Arrays.stream(tabela).boxed().toList();
        System.out.println(lista);
    }
}
