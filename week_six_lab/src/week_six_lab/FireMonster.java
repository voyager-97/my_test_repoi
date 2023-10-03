package week_six_lab;

public class FireMonster extends Monster{

	 public FireMonster(Position position, float health, int power) {
		super(position, health, power);
	}
	
	@Override
	public Position move(Position aPos) {
		// TODO Auto-generated method stub
		System.out.println("Moving Toward the target using Our Monster car ...");
		this.position = aPos;
		return this.position;
	}

	
	public void attack() {
		System.out.println("I am attacking by fire");
		
	}

	
	public void render() {
		System.out.println("Draw the shape of a Fire Monster");
		System.out.println("The X is: "+position.getX()+": The Y is: "+position.getY()+": The Z is: "+position.getZ());
		
	}
	
}