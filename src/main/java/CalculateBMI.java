import java.util.Scanner;

 class CalculateBMI {
    public static void main(String[] args) {
        double height;
        double weight;
        double result;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your weight (kg): ");
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
                break;
            } else {
                System.out.println("Please re-enter a double");
                scanner.next();
            }

        }

        while (true) {
            System.out.print("Enter your height (m): ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                break;
            } else {
                System.out.println("Please re-enter a double");
                scanner.next();
            }
        }

        result = weight / (height * height);
        System.out.println("Your BMI is: " + result);

        scanner.close();
    }
}
