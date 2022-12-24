package main;

public class Calculator {
    static void calc(double param1, double param2, String operation) {
        switch (operation) {
            case "+":
                System.out.println(param1 + param2);
                break;
            case "-":
                System.out.println(param1 - param2);
                break;
            case "*":
                System.out.println(param1 * param2);
                break;
            case "/":
                System.out.println(param1 / param2);
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
    }
    public static void main(String[] args) {
        calc(23, 10, "+");
        calc(22, 10, "-");
        calc(110, 10, "/");
        calc(24, 10, "*");
    }
}
