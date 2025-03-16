// Atividade Pratica 03 Programacao Java_Entrada e Saida de Dados
// Matheus Braga de Sousa


import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q12 {

    public static void main(String[] args) {
        
        //Questao 12:
		//Solicite ao usuario que insira um numero inteiro e um caractere, e exiba ambos em uma unica mensagem
		//formatada
		
		Scanner ler = new Scanner (System.in);

		int valor1;
		char caractere;
		
		System.out.print ("Digite o numero inteiro: ");
		valor1 = ler.nextInt ();
		
		System.out.print ("Digite um caractere: ");
		caractere = ler.next().charAt(0);
		
		System.out.print ("Os valores digitados foram: " + valor1 + " sera " + caractere);
        
    }
    
}