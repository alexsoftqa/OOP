package exeptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsHandlingMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cotinueLoop = true;
        do {
            try {
                System.out.println("Please, enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please, enter denominator");
                int denominator = scanner.nextInt();
                //System.out.println(devide(numerator, denominator));
                safeToFile(devide(numerator,denominator));
                cotinueLoop = false;
            } catch (ArithmeticException | InputMismatchException | IOException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            }   finally {

            }
            System.out.println("End of try/catch");
        } while (cotinueLoop);

    }

    private static int devide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

    public static void safeToFile(int res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
        writer.println("Result "  + res);
        writer.close();

    }
}
