package week_six_lab;

public class ZombieEnemy  extends  EnemyThreat{
    @Override
    public void attack() {
        System.out.println("Zombie is attacking...");
    }

    @Override
    public void defend() {
        System.out.println("Zombie is defending...");
    }
}
