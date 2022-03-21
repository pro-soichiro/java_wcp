package sukkiriJava;

public class SJ_9_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		w.heal(h1); //ミナトを回復させる
		w.heal(h2); //ミナトを回復させる
		
	}

}
