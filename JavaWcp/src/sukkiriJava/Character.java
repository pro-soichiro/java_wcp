package sukkiriJava;

// newできない抽象クラスの宣言「abstract」=> newできなくなる
public abstract class Character {
	String name;
	int hp;
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	// 戦う 未完成部分（抽象メソッド）の「abstracy」
	// => 処理の中身は各継承クラスでオーバーライドしてもらう
	// abstractの記述により、継承クラスはメソッドのオーバーライドをしないとコンパイルエラーになる
	public abstract void attack(Matango m);
}
