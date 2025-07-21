// File name: ReverseNumber.java

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345, reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
