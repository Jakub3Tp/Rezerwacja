import java.util.*;

public class FlightBookingSystem implements FlightReservationSystem{
    private List<Flight> loty = new ArrayList<Flight>();;
    private List<Reservation> rezerwacje = new ArrayList<>();
    public void DodajLot(Flight flight) {
        loty.add(flight);
    }
    @Override
    public void rezerwacja(Flight konkretny_lot, String imie_nawizko_pasazera, double cena_biletu) {
        if(konkretny_lot.getLiczba_dostepnych_miejsc() > 0){
            Reservation rezerwacja = new Reservation(konkretny_lot, imie_nawizko_pasazera, cena_biletu);
            rezerwacje.add(rezerwacja);
            System.out.println("Zarezerwowano");
        }else{
            System.out.println("Nie udało się zarezerwować. Spróbuj pownownie");
        }
    }

    @Override
    public void anulowanie_rezerwacji(Reservation rezerwacja) {
        Flight flight = rezerwacja.getKonkretny_lot();
        flight.setLiczba_dostepnych_miejsc(flight.getLiczba_dostepnych_miejsc() + 1);
        rezerwacje.remove(rezerwacja);
        System.out.println("Rezerwacja została anulowana");
    }

    @Override
    public List<Flight> wyszukiwania_lotow(String miejsce_docelowe, String data_wylotu) {
        List<Flight> szukanyFlight =  new ArrayList<>();
        for(Flight flight : loty) {
            if (flight.getMiejsce_docelowe().equals(miejsce_docelowe) && flight.getMiejsce_wylotu().equals(data_wylotu)) {
                szukanyFlight.add(flight);
            }
        }
        return szukanyFlight;
    }

    @Override
    public void wyswietlania_dostepnych_lotow() {
        System.out.println("Dostepne loty:");
        for (Flight flight : loty) {
            System.out.println("Przyloty: " + flight.getMiejsce_docelowe() + " Odloty" + flight.getMiejsce_wylotu() +
                    " Wylatuja " + flight.getData_wylotu() + " Czas trwania " + flight.getCzas_trwania_lotu() +
                    " Liczba wolnych miejsc " + flight.getLiczba_dostepnych_miejsc());
        }
    }

}
