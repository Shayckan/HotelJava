import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
        private static Scanner scanner = new Scanner(System.in);
        private static Hotel hotel = new Hotel();

        public static void main(String[] args) {
                boolean executando = true;

                while (executando) {
                        System.out.println("\n--- Bem vindo ao Sistema de Gerenciamento de Hotel ---");
                        System.out.println("1. Cadastrar Quarto");
                        System.out.println("2. Fazer reserva");
                        System.out.println("3. Check-in");
                        System.out.println("4. Check-out");
                        System.out.println("5. Relatório de Quartos");
                        System.out.println("6. Historico de reservas");
                        System.out.println("7. Sair");
                        System.out.print("Escolha uma opção: ");
                        int opcao = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcao) {
                                case 1:
                                        cadastrarQuarto();
                                        break;
                                case 2:
                                        cadastrarReserva();
                                        break;
                                case 3:
                                        realizarCheckIn();
                                        break;
                                case 4:
                                        realizarCheckOut();
                                        break;
                                case 5:
                                        hotel.gerarRelatorioOcupacao();
                                        break;
                                case 6:
                                        hotel.listarTodasReservas();
                                        break;
                                case 7:
                                        executando = false;
                                        System.out.println("Encerrando o sistema...");
                                        break;
                                default:
                                        System.out.println("Opção inválida!");
                        }
                }
        }

        private static void cadastrarQuarto() {
                System.out.print("Número do quarto: ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo de quarto (solteiro/casal/suite): ");
                String tipo = scanner.nextLine();
                System.out.print("Preço diário: ");
                double preco = scanner.nextDouble();
                hotel.cadastrarQuarto(numero, tipo, preco);
        }

        private static void cadastrarReserva() {
                System.out.print("Nome do hóspede: ");
                String nomeHospede = scanner.nextLine();
                System.out.print("Data de check-in: ");
                String checkIn = scanner.nextLine();
                System.out.print("Data de check-out: ");
                String checkOut = scanner.nextLine();
                System.out.print("Número do quarto reservado: ");
                int numeroQuartos = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Tipo de quarto reservado: ");
                String tipoQuarto = scanner.nextLine();
                hotel.cadastrarReserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
        }

        private static void realizarCheckIn() {
                System.out.print("Nome do hóspede: ");
                String nomeHospede = scanner.nextLine();
                hotel.realizarCheckIn(nomeHospede);
        }

        private static void realizarCheckOut() {
                System.out.print("Nome do hóspede: ");
                String nomeHospede = scanner.nextLine();
                hotel.realizarCheckOut(nomeHospede);
        }


}
