import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Figure> figures = new ArrayList<Figure>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            showMenu();
            input = scanner.nextInt();
            run(input);
        } while (input != 0);
    }

    private static void run(int input) {
        switch (input) {
            case 0: programmExit();
                break;
            case 1: newFigure();
                break;
            case 2: deleteFigures();
                break;
            case 3: listFigures();
                break;
            case 4: sortList();
                break;
        }
    }

    private static void sortList() {
        Scanner scanner = new Scanner(System.in);
        int sortKind = 0;

        System.out.println();
        System.out.println("Kind of Sort");
        System.out.println("0 - sortCircumference");
        System.out.println("1 - sortSize");
        System.out.println("---------------------");
        sortKind = scanner.nextInt();
        System.out.println();

        if (sortKind == 0) {
            figures = Sort.sortCircumference(figures);
        } else if (sortKind == 1) {
            figures = Sort.sortSize(figures);
        }
    }

    private static void listFigures() {
        System.out.println();
        System.out.println("All Figures");
        System.out.println("-----------");
        for (Figure figure : figures) {
            System.out.println(figure);
        }
        System.out.println();
    }

    private static void deleteFigures() {
        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println();
        System.out.println("Index of Figure");
        index = scanner.nextInt();
        System.out.println("---> deleted");
        System.out.println();
        figures.remove(index);
    }

    private static void newFigure() {
        Scanner scanner = new Scanner(System.in);
        int figure;

        System.out.println();
        System.out.println("Figur:");
        System.out.println("0 - Rectangle");
        System.out.println("1 - Quadrat");
        System.out.println("-------------");
        figure = scanner.nextInt();

        if (figure == 0) {
            int length;
            int width;
            int coordinates;
            System.out.println();
            System.out.println("Rechteck");
            System.out.println("------------------------------------");
            System.out.print("Länge: ");
            length = scanner.nextInt();
            System.out.print("Breite: ");
            width = scanner.nextInt();
            System.out.print("K0oordinaten der linken obenen Ecken: ");
            coordinates = scanner.nextInt();
            figures.add(new Rechteck(coordinates, length, width));
        } else if (figure == 1) {
            int length;
            int coordinates;
            System.out.println();
            System.out.println("Quadrat");
            System.out.println("------------------------------------");
            System.out.print("Länge: ");
            length = scanner.nextInt();
            System.out.print("Koordinaten der linken obenen Ecken: ");
            coordinates = scanner.nextInt();
            System.out.println();

            figures.add(new Quadrat(coordinates, length));
        }

        System.out.println();
    }

    private static void programmExit() {
        System.out.println("Programm exits");
    }

    private static void showMenu() {
        System.out.println("0 - Quit");
        System.out.println("1 - newFigure");
        System.out.println("2 - deleteFigure");
        System.out.println("3 - listFigures");
        System.out.println("4 - sortList");
        System.out.println("----------------");
    }
}
