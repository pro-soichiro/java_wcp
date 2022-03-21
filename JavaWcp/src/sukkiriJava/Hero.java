package sukkiriJava;

public class Hero {
	
//	フィールド
	String name;
	int hp;
	
	public void attack() {   }
//	名前：sleep
//	必要情報：なし
//	結果：なし
//	処理内容：眠った後はHPが100に回復する
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {   }
	public void slip() {   }
	public void run() {   }
	
}
