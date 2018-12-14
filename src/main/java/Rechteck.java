public class Rechteck extends Figure {

    private int length;
    private int width;
    private int coordinates;

    public Rechteck(int coordinates, int length, int width) {
        this.length = length;
        this.width = width;
        this.coordinates = coordinates;
    }

    @Override
    public double size() {
        return length * width;
    }

    @Override
    public double circumference() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rechteck mit Länge " + length + " und Breite " + width + ": Fläche -> " + size() + ", Umfang -> " + circumference();
    }
}
