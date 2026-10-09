import java.util.Scanner;

public class pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== ESCOLHA SEU POKEMON ===");
            System.out.println("1 - Bulbasaur (Grama)");
            System.out.println("2 - Charmander (Fogo)");
            System.out.println("3 - Squirtle (Agua)");
            System.out.println("0 - Encerrar");
            System.out.print("Digite sua escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nVoce escolheu Bulbasaur!");
                    System.out.println("Tipo: Grama e Veneno.");
                    System.out.println("Tem vantagem contra Agua, mas sofre contra Fogo.");
                    System.out.println("Boa jornada, treinador!");
                    break;

                case 2:
                    System.out.println("\nVoce escolheu Charmander!");
                    System.out.println("Tipo: Fogo.");
                    System.out.println("Tem vantagem contra Grama, mas sofre contra Agua.");
                    System.out.println("Treine bastante seu parceiro!");
                    break;

                case 3:
                    System.out.println("\nVoce escolheu Squirtle!");
                    System.out.println("Tipo: Agua.");
                    System.out.println("Tem vantagem contra Fogo, mas sofre contra Grama.");
                    System.out.println("Sua aventura acaba de comecar!");
                    break;

                case 0:
                    System.out.println("\nJogo encerrado. Ate a proxima!");
                    break;

                default:
                    System.out.println("\nOpcao invalida!");
                    System.out.println("Escolha 1, 2, 3 ou 0.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}