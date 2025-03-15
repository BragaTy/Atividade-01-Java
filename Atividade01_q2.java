import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q2 {

    public static void main(String[] args) {
        
        // Questao 2:
		// Solicite ao usuario que insira um numero real (double) e exiba o valor digitado.
        
        double numero;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero real:");
        numero = ler.nextDouble();
        
        System.out.println("O numero digitado foi: " + numero);
        
    }
    
}