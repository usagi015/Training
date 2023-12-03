package Section10;
public class PoisionMatango extends Matango{
    int times = 5;

    public PoisionMatango(char suffix) {
        super(suffix);
    }

    public void attack (Hero h){
       super.attack(h);
       if (this.times != 0){
           System.out.println("さらに毒の胞子をばらいました！");
           int damage =  this.hp/5;
           this.hp = this.hp - damage;
           System.out.println(this.hp + "ポイントのダメージ！");
           this.times -= 1;
        }
    }
}
