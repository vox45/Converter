public class Main {
    public static void main(String[] args) {
        System.out.println("Проект Converter");
        System.out.println("Версія 1.0");
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
