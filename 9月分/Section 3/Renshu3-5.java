public class Main {
  public static void main(String[] args) { 
    System.out.print("「[メニュー]1:検索 2:登録 3:削除 4:変更>」");
    int selected = new java.util.Scanner(System.in).nextInt();
    
    switch(selected){
    case 1:
        System.out.println("1:検索");
        break;
    case 2:
        System.out.println("2:登録");
        break;
    case 3:
        System.out.println("3:削除");
        break;
    case 4:
        System.out.println("4:変更");
        break;
    default:
    }
  }
}