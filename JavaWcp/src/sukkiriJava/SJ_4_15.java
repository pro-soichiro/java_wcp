package sukkiriJava;

public class SJ_4_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arrayA = {1,2,3};
		int[] arrayB;
		
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
//		1と出力されないのは配列が参照型変数であるため。
	}
}
