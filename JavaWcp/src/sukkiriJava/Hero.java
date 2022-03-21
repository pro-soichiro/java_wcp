package sukkiriJava;

public class Hero {
	
//	フィールド
	String name;
	int hp;
	Sword sword;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public Hero() {
		this("名無しの勇者");
	}
	
	public void attack() {   
		System.out.println(this.name + "は、" + sword.name + "で攻撃した！");
	}
//	名前：sleep
//	必要情報：なし
//	結果：なし
//	処理内容：眠った後はHPが100に回復する
	public final void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {   
		this.hp += sec;
		System.out.println(this.name + "は、" + sec +  "秒座った！");
		System.out.println("HPが" + sec +  "ポイント回復した");
	}
	public void slip() {   
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {   
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
}
