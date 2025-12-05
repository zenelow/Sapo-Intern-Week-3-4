public class FibonacciSequence {
    public static void main(String[] args) {
        int number = 1;
        int result;
        int temp;

        result = number;
        for (int i = 0; i < 10; i++) {
            System.out.println(result);
            temp = result;
            result += number;
            number = temp;
        }
    }
}
