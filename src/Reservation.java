public class Reservation {
    public Flight konkretny_lot;
    public String dane;
    public double cena_biletu;

    public Reservation(Flight konkretny_lot, String dane, double cena_biletu) {
        this.konkretny_lot = konkretny_lot;
        this.dane = dane;
        this.cena_biletu = cena_biletu;
        konkretny_lot.setLiczba_dostepnych_miejsc(konkretny_lot.getLiczba_dostepnych_miejsc() - 1);
    }
}
