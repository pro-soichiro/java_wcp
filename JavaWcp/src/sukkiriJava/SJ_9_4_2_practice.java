package sukkiriJava;

public class SJ_9_4_2_practice {

	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
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
