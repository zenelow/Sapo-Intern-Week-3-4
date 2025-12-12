public class FibonacciSequence {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 0;
        int result;

        for (int i = 0; i < 10; i ++) {
            result = number1 + number2;
            System.out.println(result);
            number1 = number2;
            number2 = result;
        }
    }
}
