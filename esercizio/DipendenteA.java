package esercizio;

public class DipendenteA extends Dipendente {
    private int malattia;

    public DipendenteA(double stipendio) {
        super(stipendio);
        this.malattia = 0;
    }

    public void prendiMalattia(int giorni) {
        if (giorni > 0) {
            this.malattia += giorni;
        }
    }

    @Override
    public double paga() {
        double p = super.paga();
        if (malattia == 0) {
            return p;
        } else {
            return p - (malattia * 15.0);
        }
    }

    public void stampaMalattia() {
        System.out.println("Giorni di malattia presi: " + malattia);
    }
}
