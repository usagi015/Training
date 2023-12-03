import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 8;
    final int MAX_MP = 10;

    public void selfAid() {
        this.mp -= 5;
        this.hp = this.MAX_HP;
    }

    public void pray (int a){
        this.mp += a;
        if (this.mp > this.MAX_MP){
            this.mp = this.MAX_MP;
        }
        System.out.println("実際に回復したMPの量は" + this.mp);
    }
}