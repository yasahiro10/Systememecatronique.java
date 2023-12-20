public class Refroidissement extends Actionneur {
    @Override
    void chauffer(Four f) {}

    @Override
    void refroidir(Four f) {
        f.setTemperature(25);
    }
}