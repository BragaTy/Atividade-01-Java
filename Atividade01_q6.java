import java.util.Scanner;
import java.util.InputMismatchException;

public class Atividade01_q6 {

    public static void main(String[] args) {
        
        //Questao 6:
		//Solicite ao usuario que insira dois numeros reais, multiplique-os e exiba o resultado.

        double valor1, valor2, multiplicacao;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero real:");
        valor1= ler.nextDouble ();
        
        System.out.println("Digite o segundo numero real:");
        valor2= ler.nextDouble ();
        
        multiplicacao= valor1*valor2;
        
        System.out.println("A multiplicacao dos dois numeros digitados: " + multiplicacao);
        
    }
    
}