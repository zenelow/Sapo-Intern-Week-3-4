public class TimesTable {
    public static void main(String[] args) {
        int result;
        int number = 1;

        for (int j = 1; j <= 12; j ++ ) {
            System.out.println("The timestable of " + number);
            for (int i = 1; i <= 10; i ++) {
                result = number * i;
                System.out.println(number + " * " + i + " = " + result );
            }
            number += 1;
        }
    }
}
