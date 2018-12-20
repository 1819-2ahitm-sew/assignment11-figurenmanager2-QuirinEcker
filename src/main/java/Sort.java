import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static List<Figure> sortCircumference(List<Figure> figures) {
        List<Figure> sortedList = new ArrayList<Figure>();
        double smallest = Double.MAX_VALUE;
        int smallestIndex = 0;
        Figure smallesFigure = null;

        while (figures.size() > 0){
            for (int i = 0; i < figures.size(); i++) {
                if (figures.get(i).circumference() < smallest) {
                    smallest = figures.get(i).circumference();
                    smallesFigure = figures.get(i);
                    smallestIndex = i;
                }
            }
            sortedList.add(smallesFigure);
            figures.remove(smallestIndex);
            smallesFigure = null;
            smallest = Double.MAX_VALUE;
            smallestIndex = 0;
        }
        return sortedList;
    }

    public static List<Figure> sortSize(List<Figure> figures) {
        List<Figure> sortedList = new ArrayList<Figure>();
        double smallest = Double.MAX_VALUE;
        int smallestIndex = 0;
        Figure smallesFigure = null;

        while (figures.size() > 0){
            for (int i = 0; i < figures.size(); i++) {
                if (figures.get(i).size() < smallest) {
                    smallest = figures.get(i).size();
                    smallesFigure = figures.get(i);
                    smallestIndex = i;
                }
            }
            sortedList.add(smallesFigure);
            figures.remove(smallestIndex);
            smallesFigure = null;
            smallest = Double.MAX_VALUE;
            smallestIndex = 0;
        }
        return sortedList;
    }
}