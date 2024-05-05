public class Main {
    public static void main(String[] args) {
        FlightBookingSystem SystemRezerwacji = new FlightBookingSystem();
        SystemRezerwacji.DodajLot(new Flight("Krakow", "Niemcy",
                "02-12-2023", 2,35));
        SystemRezerwacji.DodajLot(new Flight("Japonia", "Warszawa",
                "19-03-2024", 14,35));
        SystemRezerwacji.wyswietlania_dostepnych_lotow();

        Flight TanieLoty =  SystemRezerwacji.wyszukiwania_lotow("Włochy","20.02.2024").getFirst();

        SystemRezerwacji.rezerwacja(TanieLoty,"Darian Filman",1200 );

        SystemRezerwacji.wyswietlania_dostepnych_lotow();
        //nie udało się zrobić wszystkiego
    }
}