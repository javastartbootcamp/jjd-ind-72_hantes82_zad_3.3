package pl.javastart.task;

public class Checks {
    //metoda isEven, która przyjmuje liczbę całkowitą i zwraca true, jeżeli ta liczba jest parzysta lub false, jeśli jest nieparzysta,
    //metoda isOdd, która przyjmuje liczbę całkowitą i zwraca true, jeśli liczba jest nieparzysta lub false, jeśli liczba jest parzysta,
    //metoda circleField, która zwraca pole koła o promieniu przekazanym jako jej argument. Promień powinien być wyrażony jako liczba zmiennoprzecinkowa,
    //metoda power, która przyjmuje jako argument liczbę całkowitą i zwraca jej kwadrat (tę liczbę podniesioną do drugiej potęgi).

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    double circleField(int radius) {
        final double pi = Math.PI;
        double circleField = pi * Math.pow(radius, 2);
        return circleField;
    }

    double power(int number) {

        double result = Math.pow(number, 2);
        return result;
    }
}
