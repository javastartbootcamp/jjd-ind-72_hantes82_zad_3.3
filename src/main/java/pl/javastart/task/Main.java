package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Checks check = new Checks();
        int number = 4;
        System.out.printf("Czy liczba %d jest parzysta? %b\n", number, check.isEven(number));
        System.out.printf("Czy liczba %d jest nieparzysta? %b\n", number, check.isOdd(number));
        System.out.printf("Pole koła: %.2f\n", check.circleField(number));
        System.out.printf("Liczba %d podniesiona do kwadratu to: %.2f", number, check.power(number));

    }
}
