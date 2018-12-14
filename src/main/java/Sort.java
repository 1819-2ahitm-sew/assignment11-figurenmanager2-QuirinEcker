import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static List<Figure> sortCircumference(List<Figure> figures) {
        List<Figure> sortedList = new ArrayList<Figure>();
        double smallest = 0;
        Figure smallesFigure = null;

        for (Figure overFigure : figures) {
            for (Figure figure : figures) {
                if (figure.circumference() < smallest) {
                    smallest = figure.circumference();
                    smallesFigure = figure;
                }
            }
            sortedList.add(smallesFigure);
        }

        return figures;
    }

    public static List<Figure> sortSize(List<Figure> figures) {
        return figures;
    }
}
