public class PrimeNumber {
    public static void main(String[] args) {
        int number = 22;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Yes,  " + number + " is prime Number.");

        } else {
            System.out.println("No, " + number + " is Not prime Number.");
        }
    }
}
