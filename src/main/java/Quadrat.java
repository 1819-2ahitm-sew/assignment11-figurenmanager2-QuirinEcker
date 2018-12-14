public class Quadrat extends Figure {

    private int length;
    private int coordinates;

    public Quadrat(int coordinates, int length) {
        this.length = length;
        this.coordinates = coordinates;
    }

    @Override
    public double size() {
        return length * length;
    }

    @Override
    public double circumference() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Qzadrat mit Seitenlänge " + length + ": Fläche -> " + size() + ", Umfang -> " + circumference();
    }
}
