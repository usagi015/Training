public class Main {
  public static void main(String[] args) { 
    System.out.println("数あてゲーム");
    int ans = new java.util.Scanner(System.in).nextInt(10);
    
    for (int i = 0; i < 6; i ++){
        System.out.println("0 ~ 9 の整数を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        if (num == ans){
            System.out.println("アタリ");
          break;
        } else {
            System.out.println("違います");
        }
    }
    System.out.println("ゲームを終了します");
    }
}

