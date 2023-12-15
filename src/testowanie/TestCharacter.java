package testowanie;
import myapp.MyCharacter;

public class TestCharacter {
    public static void main(String[] args) {

        MyCharacter myCharacter = new MyCharacter("Kamil", "Wojownik", "ludzi", 500);


        System.out.println("Imię: " + myCharacter.getImie());
        System.out.println("Klasa postaci: " + myCharacter.getKlasaPostaci());
        System.out.println("Rasa: " + myCharacter.getRasa());
        System.out.println("Siła: " + myCharacter.getSila());
    }
}
