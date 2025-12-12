public class TimesTable {
    public static void main(String[] args) {
        for (int j = 1; j <= 12; j ++ ) {
            System.out.println("The timestable of " + j);
            for (int i = 1; i <= 10; i ++) {
                System.out.println(j + " * " + i + " = " + (i*j) );
            }
        }
    }
}
