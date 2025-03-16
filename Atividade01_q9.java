// Atividade Pratica 03 Programacao Java_Entrada e Saida de Dados
// Matheus Braga de Sousa


import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q9 {

    public static void main(String[] args) {
        
        //Questao 9:
		// Solicite ao usuario que insira dois valores booleanos, faca a operacao logica AND entre eles e exiba o
		// resultado.
		
		Scanner ler = new Scanner (System.in);

		boolean booleanoA, booleanoB, resultado;
		
		System.out.print ("Digite o primeiro valor, verdadeiro ou falso em ingles: ");
		booleanoA= ler.nextBoolean ();
		
		System.out.print ("Digite o segundo valor, verdadeiro ou falso em ingles: ");
		booleanoB= ler.nextBoolean ();
		
		resultado= booleanoA && booleanoB;
		
		System.out.print ("O valor de A and B: " + resultado);
        
    }
    
}