package week_six_lab;

public class VenomMonster extends Monster{

	
	public VenomMonster(Position position, float health, int power) {
			super(position, health, power);
		}
	
	public Position move(Position aPos) {
		// TODO Auto-generated method stub

		System.out.println("Moving Toward the target with VenomMonster...");
		this.position = aPos;
		return this.position;
	}

	public void attack() {
		System.out.println("I am attacking by venom");
	}

	
	public void render() {
		System.out.println("Draw the shape of a Venom Monster");
		System.out.println("The X is: "+position.getX()+": The Y is: "+position.getY()+": The Z is: "+position.getZ());
	}
	
}
