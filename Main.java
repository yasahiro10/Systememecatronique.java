import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        CapteurTemperature capteur = new CapteurTemperature();
        EnregistreurDonnees saveData = new EnregistreurDonnees();
        Chauffage chauffage = new Chauffage();
        Refroidissement refoidissement = new Refroidissement();
        Four four = new Four(1, capteur, saveData, chauffage, refoidissement);
        four.adjustHeating();
        four.monitorTemperature();
        four.adjustCooling();
        four.monitorTemperature();
        four.adjustHeating();
        four.adjustHeating();
        four.adjustHeating();
        four.monitorTemperature();
        four.recordData();
        Four four1 = new Four(2, capteur, saveData, chauffage, refoidissement);
        for (int i = 0; i < 10; i++) {

            four1.adjustHeating();

        }
        four1.recordData();
    }
}