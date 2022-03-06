package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] operators = {'+', '-', '*', '/'};
        List<Thread> threads = new ArrayList<>();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        for (var i = 0; i < 4; i++) {
            Thread thread = new Thread(new Calculate(operators[i], a, b));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done from - " + Thread.currentThread().getName());
    }
}
