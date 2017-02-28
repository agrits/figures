import java.util.Arrays;
import java.util.Scanner;

class Main {
    static Scanner s = new Scanner(System.in);
    static Figure figure;

    public static void main(String[] args) throws DataNotCorrectException {
        System.out.println("Wybierz figurę:");
        System.out.println("1 - Kwadrat");
        System.out.println("2 - Okrąg");
        System.out.println("3 - Trojkąt");
        switch (s.nextInt()) {
            case 1:
                double a;
                System.out.println("Podaj dlugosc boku a:");
                a = s.nextDouble();
                if (a <= 0)
                    throw new DataNotCorrectException("Dlugosc boku kwadratu nie może byc liczbą ujemną");
                else
                    figure = new Square(a);

                break;

            case 2:
                double r;
                System.out.println("Podaj promien okręgu:");
                r = s.nextDouble();
                if (r <= 0)
                    throw new DataNotCorrectException("Dlugosc promienia okręgu nie może byc liczbą ujemną");
                else
                    figure = new Circle(r);

                break;

            case 3:
                double b, c;
                System.out.println("Podaj podstawy trojkąta:");
                a = s.nextDouble();
                System.out.println("Podaj dlugosc pierwszego ramienia trojkąta:");
                b = s.nextDouble();
                System.out.println("Podaj dlugosc drugiego ramienia trojkąta:");
                c = s.nextDouble();
                double[] edges = {a, b, c};
                Arrays.sort(edges);
                for (double edge : edges)
                    if (edge < 0) {
                        throw new DataNotCorrectException("Dlugosc boku trojkąta nie może byc liczbą ujemną");
                    }
                if (edges[0] + edges[1] <= edges[2])
                    throw new DataNotCorrectException("Najdluzszy bok trojkąta musi byc krotszy od sumy dwoch pozostalych");
                else
                    figure = new Triangle(a, b, c);
                break;

            default:
                throw new DataNotCorrectException("Proszę wybrac poprawny numer figury.");
        }
        figure.print();
    }
}