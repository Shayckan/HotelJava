import java.util.ArrayList;
import java.util.List;

class Hospede {
    private String nome;
    private List<Reserva> historicoReservas;

    public Hospede(String nome) {
        this.nome = nome;
        this.historicoReservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Reserva> getHistoricoReservas() {
        return historicoReservas;
    }

    public void adicionarReserva(Reserva reserva) {
        historicoReservas.add(reserva);
    }
}
