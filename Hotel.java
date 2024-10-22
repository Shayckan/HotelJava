import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }


    public void cadastrarQuarto(int numero, String tipo, double precoDiario) {
        Quarto quarto = new Quarto(numero, tipo, precoDiario);
        quartos.add(quarto);
        System.out.println("Quarto " + numero + " cadastrado com sucesso!");
    }


    public void cadastrarReserva(String nomeHospede, String checkIn, String checkOut, int numeroQuartos, String tipoQuarto) {
        Reserva reserva = new Reserva(nomeHospede, checkIn, checkOut, numeroQuartos, tipoQuarto);
        reservas.add(reserva);
        atualizarDisponibilidade(tipoQuarto, false);
        System.out.println("Reserva feita para " + nomeHospede + " cadastrada com sucesso!");
    }


    public void realizarCheckIn(String nomeHospede) {
        System.out.println("Check-in realizado para " + nomeHospede);
    }

    public void realizarCheckOut(String nomeHospede) {
        System.out.println("Check-out  para " + nomeHospede);
        atualizarDisponibilidade(null, true);
    }


    private void atualizarDisponibilidade(String tipo, boolean disponivel) {
        for (Quarto quarto : quartos) {
            if (tipo == null || quarto.getTipo().equals(tipo)) {
                quarto.setDisponivel(disponivel);
            }
        }
    }


    public void gerarRelatorioOcupacao() {
        System.out.println("Relatório de Ocupação de Quartos:");
        for (Quarto quarto : quartos) {
            if (!quarto.isDisponivel()) {
                System.out.println(quarto);
            }
        }
    }
    public void listarTodasReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva registrada.");
        } else {
            System.out.println("Lista de todas as reservas:");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}

