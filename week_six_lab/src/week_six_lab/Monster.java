package week_six_lab;

public abstract class Monster implements Enemy{
	
	protected Position position = new Position(0.0f, 0.0f, 0.0f);
	
	protected float health = 100.0f;
	
	protected int power = 50;
	
	
	public Monster(Position position, float health, int power) {
		super();
		this.position = position;
		this.health = health;
		this.power = power;
	}


	public Position move(Position aPos) {
		System.out.println("Moving Toward the target...");
		this.position = aPos;
		return this.position;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	public float getHealth() {
		return health;
	}


	public void setHealth(float health) {
		this.health = health;
	}


	public int getPower() {
		return power;
	}


	public void setPower(int power) {
		this.power = power;
	}
	
	
		
}
