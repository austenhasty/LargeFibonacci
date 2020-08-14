import java.util.Scanner;

public class LargeFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastDigitFibonacci(n));

    }

/*    public static long lastDigitFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 1;
        long current = 2;
        for (int i = 2; i < n-1; i++) {
            long temp = prev;
            prev = current;
            current = temp + current;
        }
        return current % 10;
    } */

    public static int lastDigitFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int newLast = 1;
        int currentNum = 1;
        for (int i = 2; i < n; i++) {
            int tempNum = newLast;
            newLast = currentNum;
            currentNum = (currentNum + tempNum) % 10;
        }
        return currentNum;
    }

}
