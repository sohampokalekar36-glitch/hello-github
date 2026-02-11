import java.util.Scanner;

class AllExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // 1. Arithmetic Expressions
        System.out.println("\n--- Arithmetic Expressions ---");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // 2. Relational Expressions
        System.out.println("\n--- Relational Expressions ---");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        // 3. Logical Expressions
        System.out.println("\n--- Logical Expressions ---");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // 4. Assignment Expressions
        System.out.println("\n--- Assignment Expressions ---");
        int c = a;
        c += b;
        System.out.println("c += b → " + c);
        c -= b;
        System.out.println("c -= b → " + c);
        c *= b;
        System.out.println("c *= b → " + c);

        // 5. Unary Expressions
        System.out.println("\n--- Unary Expressions ---");
        int d = a;
        System.out.println("Post Increment d++ = " + (d++));
        System.out.println("Pre Increment ++d = " + (++d));
        System.out.println("Post Decrement d-- = " + (d--));
        System.out.println("Pre Decrement --d = " + (--d));

        // 6. Conditional (Ternary) Expression
        System.out.println("\n--- Conditional Expression ---");
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);

        // 7. Bitwise Expressions
        System.out.println("\n--- Bitwise Expressions ---");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
    }
}
