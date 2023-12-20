import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class EnregistreurDonnees {
    public void enregistrer(Four f) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt", true))) {
            writer.println("ID: " + f.getId() + ", Temperature: " + f.getTemperature());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
