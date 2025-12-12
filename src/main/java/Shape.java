public class Shape {
    public static void main(String[] args) {
        // TRIANGLE
        StringBuilder stringBuilder = new StringBuilder("*");
        System.out.println(stringBuilder);

        for (int i = 0; i < 10; i ++) {
            stringBuilder.append("*");
            System.out.println(stringBuilder);
        }
    }
}
