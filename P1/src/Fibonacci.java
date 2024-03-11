import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que informe o número
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        
        // Calcula a sequência de Fibonacci até um número maior ou igual ao informado pelo usuário
        int anterior = 0;
        int atual = 1;
        int proximo = 1;
        
        while (proximo < numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        // Verifica se o número informado pertence à sequência de Fibonacci
        if (proximo == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
