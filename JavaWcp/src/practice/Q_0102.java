package practice;

public class Q_0102 {

	public static void main(String[] args) {
		
//		1~10までに偶数が何個あるか
//		また、偶数の合計はいくつか出力する
		
		int oddCount = 0;
		int oddTotal = 0;
		
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0 ) {
				oddCount ++;
				oddTotal += i;
			}
		}
		
		System.out.println("偶数の数は" + oddCount + "個です");
		System.out.println("偶数の合計は" + oddTotal + "です");
	}
}
