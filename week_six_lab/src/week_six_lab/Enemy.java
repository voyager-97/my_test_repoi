package week_six_lab;

public interface Enemy {
	public static final int X = 2;
	
	public Position move(Position aPos);	//Returns the new Position of this enemy
	
	public void attack();	//Attacks a player by using the existing power
	
	public void render();	//Draws the shape of this enemy on the screen in the position location

}
