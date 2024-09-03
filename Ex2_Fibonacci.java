//Thaiane 
package Desafio;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Ex2_Fibonacci{
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Insira o valor que quer saber se esta na sequencia Fibonacci: ");
        int numero = s.nextInt();
        
        
        if (fibonacci(numero)){
            System.out.println("O numero " + numero + " pertence a sequencia Fibonacci");
        }else {
            System.out.println("O numero " + numero + " nao pertence a sequencia Fibonacci");
        }
    }
            

   
    public static boolean fibonacci(int indice){
     int resultado = 0, k = 1;
     if(indice == 0 || indice == 1){
         return true;
     }
     
     while(resultado < indice){ //percorre a lista fibonacci até encontrar ou passar do número
         int c = k + resultado;
         k = resultado;
         resultado = c;
     }
      return resultado == indice; // true se a igualdade é verdadeira, false se não for.
    }
}
    

