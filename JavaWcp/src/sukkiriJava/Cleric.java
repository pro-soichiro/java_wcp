package sukkiriJava;

public class Cleric {
	
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
	}
	public int pray(int sec){
		
		int mp = new java.util.Random().nextInt(2) + sec;
		
		if((this.mp + mp) <= MAX_MP) {
			this.mp += mp;
		}
		
		return mp;
	}
	
}
