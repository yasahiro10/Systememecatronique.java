import java.io.IOException;

public class Four {
    private int id;
    private float temperature = 100;
    private CapteurTemperature capteur;
    private EnregistreurDonnees enregistreur;
    private Actionneur chauffage;
    private Actionneur refoidissement;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public CapteurTemperature getCapteur() {
        return capteur;
    }

    public void setCapteur(CapteurTemperature capteur) {
        this.capteur = capteur;
    }

    public EnregistreurDonnees getEnregistreur() {
        return enregistreur;
    }

    public void setEnregistreur(EnregistreurDonnees enregistreur) {
        this.enregistreur = enregistreur;
    }

    public Actionneur getChauffage() {
        return chauffage;
    }

    public void setChauffage(Actionneur chauffage) {
        this.chauffage = chauffage;
    }

    public Actionneur getRefoidissement() {
        return refoidissement;
    }

    public void setRefoidissement(Actionneur refoidissement) {
        this.refoidissement = refoidissement;
    }

    public Four(int id, CapteurTemperature capteur, EnregistreurDonnees enregistreur, Actionneur chauffage, Actionneur refoidissement) {
        this.id = id;
        this.capteur = capteur;
        this.enregistreur = enregistreur;
        this.chauffage = chauffage;
        this.refoidissement = refoidissement;
    }

    public void monitorTemperature() {
        System.out.println("The current temperature "+capteur.lireTemperature(this));
    }

    public void adjustHeating() {
        chauffage.chauffer(this);
    }

    public void adjustCooling() {
        refoidissement.refroidir(this);
    }

    public void recordData() throws IOException {
        enregistreur.enregistrer(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
