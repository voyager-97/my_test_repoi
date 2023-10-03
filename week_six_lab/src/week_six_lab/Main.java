package week_six_lab;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercise:
		//Follow the logic of enemy, create another abstract class with two concrete classes
		//For instance, abstract BlueEnemy and RedEnemy and HumanPlayer
		//Come up with the abstract and concrete classes on your own, do not use BlueEnemy, RedEnemy, etc.
		//Test your classes in the main method here, i.e. create an instance of each concrete class and call 
		//the methods to make sure that it is working as expected.

		Position position =new Position(3.1f,2.8f,5.9f);
		VenomMonster venomMonster = new VenomMonster(position, 2.1f, 10);
		FireMonster fireMonster = new FireMonster(position, 2.3f, 10);

		System.out.println("Values for venomMonster obj");

		venomMonster.move(position);
		venomMonster.attack();
		venomMonster.render();

		System.out.println("******************");


		System.out.println("Values for fireMonster obj");

		fireMonster.move(position);
		fireMonster.attack();
		fireMonster.render();



		System.out.println("*******************");

		EnemyThreat zombie = new ZombieEnemy();
		EnemyThreat robot = new RobotEnemy();

		zombie.attack();
		zombie.defend();

		robot.attack();
		robot.defend();
	}
}
