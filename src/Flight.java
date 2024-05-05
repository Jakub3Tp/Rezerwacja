public class Flight {
    public String miejsce_docelowe;
    public String miejsce_wylotu;
    public String data_wylotu;
    public int czas_trwania_lotu;
    public int liczba_dostepnych_miejsc;

    public Flight(String miejsce_docelowe, String miejsce_wylotu, String data_wylotu, int czas_trwania_lotu, int liczba_dostepnych_miejsc) {
        this.miejsce_docelowe = miejsce_docelowe;
        this.miejsce_wylotu = miejsce_wylotu;
        this.data_wylotu = data_wylotu;
        this.czas_trwania_lotu = czas_trwania_lotu;
        this.liczba_dostepnych_miejsc = liczba_dostepnych_miejsc;
    }

    public String getMiejsce_docelowe() {
        return miejsce_docelowe;
    }

    public void setMiejsce_docelowe(String miejsce_docelowe) {
        this.miejsce_docelowe = miejsce_docelowe;
    }

    public String getMiejsce_wylotu() {
        return miejsce_wylotu;
    }

    public void setMiejsce_wylotu(String miejsce_wylotu) {
        this.miejsce_wylotu = miejsce_wylotu;
    }

    public String getData_wylotu() {
        return data_wylotu;
    }

    public void setData_wylotu(String data_wylotu) {
        this.data_wylotu = data_wylotu;
    }

    public int getCzas_trwania_lotu() {
        return czas_trwania_lotu;
    }

    public void setCzas_trwania_lotu(int czas_trwania_lotu) {
        this.czas_trwania_lotu = czas_trwania_lotu;
    }

    public int getLiczba_dostepnych_miejsc() {
        return liczba_dostepnych_miejsc;
    }

    public void setLiczba_dostepnych_miejsc(int liczba_dostepnych_miejsc) {
        this.liczba_dostepnych_miejsc = liczba_dostepnych_miejsc;
    }
}
