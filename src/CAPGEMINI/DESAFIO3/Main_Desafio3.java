/**
 * @autor Washington Esposito
 * @version 1.0
 * @data 19/02/2022
 */

package CAPGEMINI.DESAFIO3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main_Desafio3 {


    public static void main(String[] args) {
        System.out.print("Digite uma palavra: "); // solicita a palavra
        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.next();
            subString(palavra);
        }

        static void subString(String s){
            HashMap<String, Integer> map= new HashMap<>(); //cria mapa para conter substrings

            for(int i = 0; i < s.length(); i++){
                for(int j = i; j < s.length(); j++){
                    char[] valC = s.substring(i, j+1).toCharArray();
                    Arrays.sort(valC);
                    String val = new String(valC);
                    if (map.containsKey(val))
                        map.put(val, map.get(val)+1);
                    else
                        map.put(val, 1);
                }
            }
            int anagramPairCount = 0;
            for(String key: map.keySet()){
                int n = map.get(key);
                anagramPairCount += (n * (n-1))/2;
            }
            System.out.println(anagramPairCount);
        }
    }

