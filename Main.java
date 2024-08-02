public class Main {
    public static void main(String[] args) {
        System.out.println("This is my project");
        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

        double km = 16.0934;
        double mi = kilometersToMiles(km);
        System.out.println(km + " kilometers is equal to " + mi + " miles");
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
