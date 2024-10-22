class Reserva {
    private String nomeHospede;
    private String checkIn;
    private String checkOut;
    private int numeroQuartosReservados;
    private String tipoQuartoReservado;

    public Reserva(String nomeHospede, String checkIn, String checkOut, int numeroQuartosReservados, String tipoQuartoReservado) {
        this.nomeHospede = nomeHospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numeroQuartosReservados = numeroQuartosReservados;
        this.tipoQuartoReservado = tipoQuartoReservado;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public int getNumeroQuartosReservados() {
        return numeroQuartosReservados;
    }

    public String getTipoQuartoReservado() {
        return tipoQuartoReservado;
    }

    @Override
    public String toString() {
        return "Reserva de " + nomeHospede + ": " + tipoQuartoReservado + " | Check-in: " + checkIn + " | Check-out: " + checkOut;
    }
}