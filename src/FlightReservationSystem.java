import java.util.List;

public interface FlightReservationSystem {
    void rezerwacja(Flight konkretny_lot, String dane, double cena_biletu);
    void anulowanie_rezerwacji(Reservation rezerwacja);
    List<Flight> wyszukiwania_lotow(String  miejsce_wylotu, String data_wylotu);
    void wyswietlania_dostepnych_lotow();
}
