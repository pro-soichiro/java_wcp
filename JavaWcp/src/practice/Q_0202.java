package practice;

public class Q_0202 {

	public static void main(String[] args) {

//		10の要素を持つint型の配列を宣言し、適当な数を入れる
//		その配列の平均を求め、平均以下の数値のみを出力させるプログラムを作りなさい
		
		int array[] = {10,3,25,15,2,19,11,6,8,22};
		int avg = 0;
		
		for(int number: array) {
			avg += number;
		}
		avg = avg / array.length;
		
		for(int number: array) {
			if(number <= avg) {
				System.out.println(number);
			}
		}
		
	}
	
}
