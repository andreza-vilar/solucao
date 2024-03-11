import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que informe a string
        System.out.print("Informe uma string para ser invertida: ");
        String original = scanner.nextLine();
        
        // Converte a string para um array de caracteres
        char[] caracteres = original.toCharArray();
        
        // Inverte os caracteres no array
        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }
        
        // Cria uma nova string com os caracteres invertidos
        String invertida = new String(caracteres);
        
        // Exibe a string invertida
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
}
