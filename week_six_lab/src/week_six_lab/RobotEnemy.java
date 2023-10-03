package week_six_lab;

public class RobotEnemy  extends EnemyThreat{
    @Override
    public void attack() {
        System.out.println("Robot is attacking...");
    }

    @Override
    public void defend() {
        System.out.println("Robot is defending...");
    }
}
