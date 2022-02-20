/**
 * @autor Washington Esposito
 * @version 1.0
 * @data 19/02/2022
 */
package CAPGEMINI.DESAFIO2;

import javax.swing.JOptionPane;

public class Main_Desafio2 {
    public static void main(String[] args) {
        int maiusculas = 0, minusculas = 0, numeros = 0, especial = 0, caracter_faltante=0; //declara variaveis
        String exemplo = "!@#$%^&*()_+";
        String senha = JOptionPane.showInputDialog("Digite uma senha forte na caixa abaixo:" + // solicita senha
                "\n\n Contendo no mínimo 6 caracteres\n Contendo no mínimo 1 digito" +
                "\n Contendo no mínimo 1 letra em minúsculo\n Contendo no mínimo 1 letra em maiúsculo" +
                "\n Contendo no mínimo 1 caractere especial do tipo " + exemplo );

        for (int i = 0; i < senha.length(); i++) { // percorre todos os caracteres da senha
            char c = senha.charAt(i); // pegar o caractere

            if (Character.isUpperCase(c)) { //testa se é maiúscula
                maiusculas++;
            } else if (Character.isLowerCase(c)) { //testa se é minúscula
                minusculas++;
            } else if (Character.isDigit(c)) { //testa se é numero
                numeros++;
            }else for (int j = 0; j <exemplo.length(); j++) { //testa se é caracter especial
                char e = exemplo.charAt(j);
                if (c == e) {
                    especial++;
                }
            }
        }
        if(maiusculas == 0) { // verifica se foi utilizado
            caracter_faltante++;
        }if(minusculas == 0) {
            caracter_faltante++;
        }if(numeros == 0) {
            caracter_faltante++;
        }if(especial == 0) {
            caracter_faltante++;
        }while(caracter_faltante + senha.replace(" ", "").length() < 6) { // verifica o tamanho
            caracter_faltante ++;
        }

        JOptionPane.showMessageDialog(null,caracter_faltante, // retorna número de caracteres
                "Caracteres faltantes para uma senha forte",2);
    }
}
