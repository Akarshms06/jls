import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Choose an exception to handle: ");
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("3. NumberFormatException");
            System.out.println("4. StringIndexOutOfBoundsException");
            System.out.println("5. NullPointerException");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Performing division by zero...");
                        int result = 10 / 0;
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        System.out.println("Accessing invalid array index...");
                        int[] arr = {1, 2, 3};
                        System.out.println("Element: " + arr[5]);
                        break;

                    case 3:
                        System.out.println("Converting invalid string to number...");
                        String invalidNumber = "abc";
                        int num = Integer.parseInt(invalidNumber);
                        System.out.println("Converted number: " + num);
                        break;

                    case 4:
                        System.out.println("Accessing invalid string index...");
                        String str = "Hello";
                        System.out.println("Character: " + str.charAt(10));
                        break;

                    case 5:
                        System.out.println("Accessing method on a null object...");
                        String nullString = null;
                        System.out.println("Length: " + nullString.length());
                        break;

                    case 6:
                        System.out.println("Exiting program. Goodbye!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Array index is out of range.");
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException: Invalid number format.");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Caught StringIndexOutOfBoundsException: String index is out of range.");
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: Null object accessed.");
            }
        }
    }
}