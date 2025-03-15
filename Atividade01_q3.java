import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q3 {

    public static void main(String[] args) {
        
        // Questao 3:
        // Solicite ao usuario que insira um caractere e exiba o valor digitado
        
        char caractere;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um caractere:");
        caractere = ler.nextLine().charAt(0);
        
        System.out.println("O primeiro valor digitado foi: " + caractere);
        
    }
    
}