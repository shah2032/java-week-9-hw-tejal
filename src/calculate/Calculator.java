package calculate;

public class Calculator {
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + "and" + b + "is" + (a + b));

    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + "and" + b + "is" + (a - b));


    }

    public void division(int a, int b) {
        System.out.println("Division of " + a + "and" + b + "is" + (a / b));


    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);

    }

    public void calculateResult(int a, int b, char symbol) {
        // float res;


        if (symbol == '+') {
            System.out.println(a + b);
            // res = a+ b;
        } else if (symbol == '-') {
            System.out.println(a - b);
            // res = a - b;
        } else if (symbol == '*') {
            System.out.println(a * b);
            //res = a * b;
        } else if (symbol == '/') {
            try {
                division(a, b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Number cannot be divided by 0");
            }

        } else {
            System.out.println("Invalid number");
        }
    }
}