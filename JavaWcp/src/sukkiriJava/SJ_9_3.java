package sukkiriJava;

public class SJ_9_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
	
		System.out.println(h.name + "の現在の武器は" + h.sword.name + "です。");
	
	}

}
