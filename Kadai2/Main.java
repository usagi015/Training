import java.util.Scanner;

class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] num = input.split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        if ((N < 1 || N > 100) && (M < 1 || M > 100)){
            return;
        }

        int[] test = new int[N];
        int[] absence = new int[N];
        String[] line = new String[N];

        for (int i = 0; i < N; i ++){
            line[i] = scanner.nextLine();
            String[] parts = line[i].split(" ");
            test[i] = Integer.parseInt(parts[0]);
            absence[i] = Integer.parseInt(parts[1]);
            if ((test[i] < 0 || test[i] > 100) && (absence[i] < 0 || absence[i] > 15)){
               return;
            }
        }
        for (int j = 0; j < N; j ++){
            if (Math.max(test[j] - absence[j]*5, 0) >= M){
                System.out.println(j+1);
            }
        }
    }
}