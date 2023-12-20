public class Chauffage extends Actionneur {
    @Override
    void chauffer(Four f) {
        f.setTemperature(f.getTemperature() + 10);
    }

    @Override
    void refroidir(Four f) {}
}
