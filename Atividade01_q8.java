// Atividade Pratica 03 Programacao Java_Entrada e Saida de Dados
// Matheus Braga de Sousa


import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q8 {

    public static void main(String[] args) {
        
        //Questao 8:
		//Solicite ao usuario que insira um caractere e um numero inteiro, e exiba ambos.

        int valor1;
        char caractere;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        valor1= ler.nextInt ();
        
        System.out.println("Digite um caractere :");
        caractere = ler.next().charAt(0);
            
        System.out.println("Os dois valores digitados sao: " + valor1 + " e " + caractere);
        
    }
    
}