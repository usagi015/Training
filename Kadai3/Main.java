import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] line_split = line.split(" ");
        int N = Integer.parseInt(line_split[0]);
        int M = Integer.parseInt(line_split[1]);
        if ((N < 1) || (N > 100) || (M < 1) || (M > 100)){
            return;
        }


        int[] wei = new int[M];
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            wei[i] = scanner.nextInt();
            if (wei[i] < 1 || wei[i] > 1000){
                return;
            }
            int j = wei[i] / N;
            int a = Math.abs(wei[i] - j * N);
            int b = Math.abs(wei[i] - (j + 1) * N);
            if (j == 0){
                result[i] = (j+1)*N;
            } else if (a < b){
                result[i] = j*N;
            } else if (a > b){
                result[i] =(j+1)*N;
            } else if (a == b){
                result[i] =(j+1)*N;
            }
        }

        for (int i = 0; i < M; i ++){
            System.out.println(result[i]);
        }
    }
}
