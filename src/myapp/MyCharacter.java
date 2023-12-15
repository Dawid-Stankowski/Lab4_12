package myapp;

public class MyCharacter {
    private String imie;
    private String klasaPostaci;
    private String rasa;
    private int sila;
    public MyCharacter(String imie, String klasaPostaci, String rasa, int sila) {
        this.imie = imie;
        this.klasaPostaci = klasaPostaci;
        this.rasa = rasa;
        this.sila = sila;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKlasaPostaci() {
        return klasaPostaci;
    }

    public void setKlasaPostaci(String klasaPostaci) {
        this.klasaPostaci = klasaPostaci;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }
}
