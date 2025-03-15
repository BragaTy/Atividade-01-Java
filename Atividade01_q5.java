import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q5 {

    public static void main(String[] args) {
        
        //Questao 5:
		//Solicite ao usuario que insira dois numeros inteiros, some-os e exiba o resultado.
        
        int valor1, valor2, soma;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero ");
        valor1= ler.nextInt ();
        
        System.out.println("Digite o segundo numero ");
        valor2= ler.nextInt ();
        
        soma= valor1+valor2;
        
        System.out.println("A soma dos dois numeros digitados: " + soma);
        
    }
    
}