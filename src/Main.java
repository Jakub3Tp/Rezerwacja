public class Main {
    public static void main(String[] args) {
        FlightBookingSystem SystemRezerwacji = new FlightBookingSystem();
        SystemRezerwacji.DodajLot(new Flight("Wrocław", "Rzym", "20-02-2024", 4,35));
        SystemRezerwacji.DodajLot(new Flight("Warszawa", "Bolonia", "29-02-2024", 4,35));
        SystemRezerwacji.wyswietlania_dostepnych_lotow();

        Flight TanieLoty =  SystemRezerwacji.wyszukiwania_lotow("Wrocław","20 luty").get(0);

        SystemRezerwacji.rezerwacja(TanieLoty,"Darian Filman",500 );

        SystemRezerwacji.wyswietlania_dostepnych_lotow();

        int NowaRezerwacja =  SystemRezerwacji.wyszukiwania_lotow("Wrocław", "20-02-2024").get(0).getLiczba_dostepnych_miejsc();

        SystemRezerwacji.anulowanie_rezerwacji(NowaRezerwacja);
        SystemRezerwacji.wyswietlania_dostepnych_lotow();
    }
}