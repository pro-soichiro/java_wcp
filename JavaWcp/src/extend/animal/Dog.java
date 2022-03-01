package extend.animal;

//　継承クラス
public class Dog extends Animal {
	public Dog() {
		this.name = "犬";
	}
	
	
//	抽象メソッドをオーバーライドして確定している
	public void cry() {
		System.out.println(this.name + "が吠えました。ワン！ワン！");
	}

}
