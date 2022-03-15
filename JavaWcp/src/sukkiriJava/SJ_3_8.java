package sukkiriJava;

public class SJ_3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		複雑なfor文
		
//		ループ変数を5づつ増やす
		int array[] = new int[20];
		int count = 0;
		
		for(int i = 0; count < array.length; i += 5) {
			array[count] = i;
			System.out.println(array[count]);
			count ++;
		}
		
//		シンプルに5回繰り返したいとき
//		繰り返し時の処理を行わない
		for(int i = 0; i < 5;) {
			System.out.print("*");
			i ++;
		}
		
	}

}
