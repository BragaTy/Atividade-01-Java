// Atividade Pratica 03 Programacao Java_Entrada e Saida de Dados
// Matheus Braga de Sousa


import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q10 {

    public static void main(String[] args) {
        
        //Questao 10:
		//Solicite ao usuario que insira um numero inteiro e exbia o seu valor absoluto.
		
		Scanner ler = new Scanner (System.in);

		int valor1, absoluto;
		
		System.out.print ("Digite o primeiro valor: ");
		valor1 = ler.nextInt ();
		
		absoluto= Math.abs(valor1);
		
		System.out.print ("O valor absoluto de: " + valor1 + " sera " + absoluto);
        
    }
    
}