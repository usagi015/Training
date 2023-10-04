public class Main {
  public static void main(String[] args) { 
    int isHungry = 0;
    String food = "sushi";
    System.out.println("こんにちは");
    if (isHungry == 0){
        System.out.println("お腹がいっぱいです");
    } else { 
        System.out.println("はらペコです");
    }
    if (isHungry == 1){
        System.out.println(food + "をいただきます");
    }    
    System.out.println("ごちそうさまでした");
  }
}

