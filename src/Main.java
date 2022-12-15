public class Main {
    public static void main(String[] args) {

        int ticketPrice = 3750;
        int coefficientMiles = 20;
        int miles = ticketPrice / coefficientMiles;

        System.out.println("Потратив " + ticketPrice + " рублей " + "вы получите " + miles + " миль");
    }
}