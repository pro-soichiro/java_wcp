package sukkiriJava;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		1.勇者を生成
		Hero h = new Hero();
//		2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
//		3.勇者のメソッドを呼び出してゆく
		h.sit(5); //5秒座れ
		h.slip(); //転べ
		h.sit(25); //25秒座れ
		h.run(); //逃げろ
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
//		冒険の始まり
		h.slip(); //勇者は転ぶ
		m1.run(); //お化けキノコAが逃げる
		m2.run(); //お化けキノコBが逃げる
		h.run(); //勇者も逃げる
		
		Cleric c = new Cleric();
		c.name = "聖職者";
		
		System.out.println(c.name + "が生まれた!");
		System.out.println("[ステータス]HP:" + c.hp + "MP:" + c.mp);
		
		c.selfAid();
		c.pray(3);
//		System.out.println(c.name + "は、" + c.pray(3) + "秒間祈った。");
		System.out.println("[ステータス]HP:" + c.hp + "MP:" + c.mp);
	}

}
