public class Main {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 8;

        // Method calls for isOdd
        System.out.println("Is " + num1 + " odd? " + Numeric.isOdd(num1));
        System.out.println("Is " + num2 + " odd? " + Numeric.isOdd(num2));

        // Method calls for isEven
        System.out.println("Is " + num1 + " even? " + Numeric.isEven(num1));
        System.out.println("Is " + num2 + " even? " + Numeric.isEven(num2));

        // Method calls for square
        System.out.println("Square of " + num1 + ": " + Numeric.square(num1));
        System.out.println("Square of " + num2 + ": " + Numeric.square(num2));

        // Method calls for cube
        System.out.println("Cube of " + num1 + ": " + Numeric.cube(num1));
        System.out.println("Cube of " + num2 + ": " + Numeric.cube(num2));
    }
}