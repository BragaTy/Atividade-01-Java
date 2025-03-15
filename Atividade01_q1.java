import java.util.Scanner;

public class Atividade01_q1 {

    public static void main(String[] args) {
        
        // Questao 1:
        // Solicite ao usuario que insira um numero inteiro e exiba o valor digitado.
        
        int numero;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero inteiro:");
        numero = ler.nextInt();
        
        System.out.println("O numero digitado foi: " + numero);
        
    }
    
}