/**
 * @autor Washington Esposito
 * @version 1.0
 * @data 19/02/2022
 */

package CAPGEMINI.DESAFIO1;

import java.io.IOException;
import java.util.Scanner;

public class Main_Desafio1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Digite um número natural maior que zero: "); //solicita entrada.
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt(); //armazena valor da entrada.
        int valortemp = valor; // cópia da entrada
        for (int i = 1; i <= valor; i++) //itera até o tamanho da entrada
        {
            for(int k= valortemp; k>0; k--) { //preenche com vazios usando a cópia q será decrementada
                System.out.print(" ");
            }
            valortemp--;
                for (int j = 1; j <= i; j++) { //preenche com *
                    System.out.print("*");
                }
                if (i != valor) System.out.print("\n"); // evita o espaço final

        }
    }
}
