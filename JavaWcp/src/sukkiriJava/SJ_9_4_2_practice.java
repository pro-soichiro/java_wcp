package sukkiriJava;

public class SJ_9_4_2_practice {

	public static void heal(int hp) {
		hp += 10;
//		引数がint型の場合、変数baseHpの値が引数hpにコピーされる「値渡し」により、メソッド内での代入は呼び出し元へ影響しない
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
//		引数がクラス型の場合、t.hpとthief.hpはメモリの同じ場所を指すことになる。そのためthief.hpへの代入がt.hpにも反映している
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int baseHp = 25;
		
		Thief t = new Thief("アカサ", baseHp);
		
		System.out.println(baseHp + " : " + t.hp); // 25 : 25
		heal(baseHp); // baseHp 25 => 25 
		heal(t); // t.hp 25 => 35
		System.out.println(baseHp + " : " + t.hp); // 25 : 35
		
	}

}
