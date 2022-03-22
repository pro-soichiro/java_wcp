package sukkiriJava;

public class PoisonMatango extends Matango {
	
	int poisonAttack = 5;
	
//	public PoisonMatango(){
	public PoisonMatango(char suffix){
//		superは親クラスのコンストラクタの呼び出し
//		super();
//		しかし上記だとエラーになる
//		親クラスのコンストラクトとシグネチャが異なるため引数なしができない
//		super(); //親コンストラクタが引数なしであれば実行可能
		
		super(suffix);
	}
	
	public void attack(Hero h) {
//		superは親インスタンス部分のメソッドの呼び出し
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
