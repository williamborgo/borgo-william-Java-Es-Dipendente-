package esercizio;

public class Main {
    public static void main(String[] args) {
        DipendenteA dipendente = new DipendenteA(2000); // Nome variabile più chiaro
        dipendente.prendiMalattia(7);
        dipendente.stampaMalattia();
        System.out.println("Stipendio dopo la riduzione: " + dipendente.paga());
    }
}
