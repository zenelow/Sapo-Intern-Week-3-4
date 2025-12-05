public class Shape {
    public static void main(String[] args) {
        // TRIANGLE
        String line;
        for (int i = 1; i <= 10; i ++) {
            line = "*";
            for (int j = 0; j < i-1; j ++) {
                line = line + "*";
            }
            System.out.println(line);
        }
    }
}
