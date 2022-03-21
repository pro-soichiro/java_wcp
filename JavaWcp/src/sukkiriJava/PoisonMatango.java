package sukkiriJava;

public class PoisonMatango extends Matango {
	
	int poisonAttack = 5;
	
	public PoisonMatango(){
		super('A');
	}
	
	public void sttack(Hero h) {
		super.attack(h);
		if (this.poisonAttack > 0 ) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ！");
			this.poisonAttack --;
		}
	}
	
}
