package q3;

public class Calculate implements Runnable {
    private char operator;
    private double a;
    private double b;

    public Calculate(char operator, double a, double b) {
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        switch (operator) {
            case '+':
                System.out.println("From thread - "+ Thread.currentThread().getName()+" "+ (a + b));
                break;
            case '-':
                System.out.println("From thread - "+ Thread.currentThread().getName()+" " +(a - b));
                break;
            case '*':
                System.out.println("From thread - "+ Thread.currentThread().getName()+" "+(a * b));
                break;
            case '/':
                System.out.println("From thread - "+ Thread.currentThread().getName()+" "+(a / b));
                break;
            default:
                System.out.println("From thread - "+ Thread.currentThread().getName()+" "+"Invalid operator");
        }
    }

}
