package q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        calculateFunc(x,n);
    }

    private static void calculateFunc(int x, int n) {
        char operator = '-';
        double result = 0;
        for (int i = 1; i <= n; i++) {
            if (operator == '-') {
                result -= Math.pow(x, i*2)/factorial(i);
                operator = '+';
            }
            else {
                result += Math.pow(x, i*2)/factorial(i);
                operator = '-';
            }
        }
        System.out.println("The Result are: "+result);
    }

    private static double factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
