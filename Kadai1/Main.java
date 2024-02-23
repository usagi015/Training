
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int output = 100 + N * 10;
        if (1 <= N && N <= 30) {
            System.out.println(output);
        }
    }
}
