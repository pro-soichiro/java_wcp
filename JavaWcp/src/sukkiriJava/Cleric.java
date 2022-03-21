package sukkiriJava;
import java.util.Random;

public class Cleric {
	
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した");		
	}
	public int pray(int sec){
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		
		int recover = new Random().nextInt(3) + sec;
//		Mathクラスのminメソッド
//		引数に指定した値のうち、小さい方の値を返す
//		<4回復する時、現在mpが9の場合>
//		10 - 9 , 4　=> 1が返る
//		<4回復する時、現在mpが5の場合>
//		10 - 5 , 4  => 4が返る
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");		
		return recoverActual;
	}
	
}
