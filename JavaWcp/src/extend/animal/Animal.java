package extend.animal;

// 抽象クラス
public abstract class Animal {
	protected String name;
	
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	
//	抽象メソッド
	public abstract void cry();

}
