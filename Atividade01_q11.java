// Atividade Pratica 03 Programacao Java_Entrada e Saida de Dados
// Matheus Braga de Sousa


import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q11 {

    public static void main(String[] args) {
        
        //Questao 11:
		//Solicite ao usuario que insira um numero real e exiba a sua raiz quadrada.
		
		Scanner ler = new Scanner (System.in);

		double valor1, raiz;
		
		System.out.print ("Digite o numero que gostaria de saber a raiz quadrada: ");
		valor1 = ler.nextDouble ();
		
		raiz= Math.sqrt(valor1);
		
		System.out.print ("O valor da raiz quadrade de: " + valor1 + " sera " + raiz);
        
    }
    
}