package sukkiriJava;

public class SuperHero extends Hero {
	boolean flying;
	public SuperHero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	public void attack(Matango m) {   
		super.attack(m);
//		System.out.println(this.name + "の攻撃！");
//		m.hp -= 5;
//		System.out.println(this.name + "5ポイントのダメージを与えた！");
		if (this.flying) {
			super.attack(m);
//			System.out.println(this.name + "の攻撃！");
//			m.hp -= 5;
//			System.out.println(this.name + "5ポイントのダメージを与えた！");
		}
		
	}
	
}
