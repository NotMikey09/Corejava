package exceptionhandling.exceptionproblems.p4.exception;
import java.util.Scanner;

public class ClassNotFoundExpDemo {

    public ClassNotFoundExpDemo(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            System.out.println("Class " + className + " found: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.err.println("Class " + className + " not found.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the class name to load: ");
            String className = scanner.nextLine();

            new ClassNotFoundExpDemo(className);
        }
    }
}