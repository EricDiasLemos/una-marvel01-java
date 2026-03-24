import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do recruta:");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade para verificar o alistamento militar:");
        int idade = scanner.nextInt();

        System.out.print("Qual o seu peso? (em kg)");
        double peso = scanner.nextDouble();

        scanner.close();

        if (peso < 50) {
            System.out.println("Recruta " + nome + ", você está abaixo do peso mínimo para o alistamento militar.");
        } else if (peso >= 50 && peso <= 100) {
            System.out.println("Recruta " + nome + ", você está dentro do peso ideal para o alistamento militar.");
            if (idade >= 18 && idade <= 25) {
                System.out.println("Recruta " + nome + ", você está dentro da faixa etária para o alistamento militar.");
                System.out.println("Parabéns, " + nome + "! Você está apto para o alistamento militar. Bem-vindo às forças armadas!");
            } else {
                System.out.println("Recruta " + nome + ", você está fora da faixa etária para o alistamento militar.");
            }
            
        } else {
            System.out.println("Recruta " + nome + ", você está acima do peso máximo para o alistamento militar.");
        }

    }
}
