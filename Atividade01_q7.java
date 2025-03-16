// Atividade Pratica 03 Programacao Java_Entrada e Saida de Dados
// Matheus Braga de Sousa


import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q7 {

    public static void main(String[] args) {
        
        //Questao 7:
		//Solicite ao usuario que insira um numero inteiro e um numero real, some-os e exiba o resultado.

        int valor1;
        double valor2, resultado;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero sendo inteiro:");
        valor1= ler.nextInt ();
        
        System.out.println("Digite o segundo numero sendo real:");
        valor2= ler.nextDouble ();
        
        resultado= valor1+valor2;
        
        System.out.println("A soma dos dois numeros digitados: " + resultado);
        
    }
    
}