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

    public Flight getKonkretny_lot() {
        return konkretny_lot;
    }

    public void setKonkretny_lot(Flight konkretny_lot) {
        this.konkretny_lot = konkretny_lot;
    }

    public String getDane() {
        return dane;
    }

    public void setDane(String dane) {
        this.dane = dane;
    }

    public double getCena_biletu() {
        return cena_biletu;
    }

    public void setCena_biletu(double cena_biletu) {
        this.cena_biletu = cena_biletu;
    }
}
