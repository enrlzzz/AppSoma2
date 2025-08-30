package appsoma2;

import java.util.Scanner;

public class AppSoma2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo(a) ao AppSoma2");
        System.out.println("Digite 5 numeros para serem somados.");
        
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();
        
        System.out.println("Digite o quarto numero: ");
        int num4 = scanner.nextInt();
        
        System.out.println("Digite o quinto numero: ");
        int num5 = scanner.nextInt();
        
        int soma = num1 + num2 + num3 + num4 + num5;
        
        System.out.println("A soma dos cinco numeros e igual a: " + soma);
        
    }
    
} 
