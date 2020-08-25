import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson1MathUtil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a function: min2, max2, abs, isEven, min3, max3");

        String test = scanner.nextLine();


        if(test.equalsIgnoreCase("min2")) {
            System.out.println("Please enter 2 numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                    System.out.println(min(a, b));
        } else if (test.equalsIgnoreCase("max2")){
            System.out.println("Please enter 2 numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                    System.out.println(max(a, b));
        } else if (test.equalsIgnoreCase("abs")){
            System.out.println("Please enter a number");
                int a = scanner.nextInt();
                    System.out.println(abs(a));
        } else if (test.equalsIgnoreCase("isEven")){
            System.out.println("Please enter a number");
                int a = scanner.nextInt();
                    System.out.println(isEven(a));
        } else if (test.equalsIgnoreCase("min3")){
            System.out.println("Please enter 3 numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                    System.out.println(min(a, b, c));
        } else if (test.equalsIgnoreCase("max3")){
            System.out.println("Please enter 3 numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                    System.out.println(max(a, b, c));
        } else {
            System.out.println("Wrong input, please try again");;

        }

        int aa = 4;
        Integer b = aa;




    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static int max(int a, int b) {

        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a > 0) {
            return a;
        } else {
            return (-a);
        }
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        if (a % 2 == 0) {
            return true;
        } else {
            // tagasta false kui a on paaritu arv
            return false;
        }
    }

    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}


