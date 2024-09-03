//Thaiane
package Desafio;

import java.util.Scanner;

public class Ex5_InverterString {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite seu texto para inversao: ");
        String texto = s.nextLine();
        
        String inversa = inverteString(texto);
        System.out.println("Texto invertido: " + inversa);

    }
    
    public static String inverteString(String t){
        char [] texto = t.toCharArray();
        int inicio = 0;
        int fim = texto.length -1;
        
        while(inicio < fim){
            char temp = texto[inicio];
            texto[inicio] = texto[fim];
            texto [fim] = temp;
            
            inicio ++;
            fim--;
        }
        return new String(texto);
    }
}
