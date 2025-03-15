import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q4 {

    public static void main(String[] args) {
        
        //Questão 4:
		//Solicite ao usuário que insira um valor booleano (true/false) e exiba o valor digitado.
        
        boolean valorVouF;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("True ou False?");
        valorVouF = ler.nextBoolean ();
        
        System.out.println("O valor digitado foi: " + valorVouF);
        
    }
    
}