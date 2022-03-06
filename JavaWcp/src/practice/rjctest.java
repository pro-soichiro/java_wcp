package practice;

public class rjctest {

	public static void main(String[] args) {
		// 1問目
		// 1~10までの数字のうち偶数のみを昇順で表示させる
		int start = 1;
		int end = 10;
		for(int i = start; i <= end; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// 2問目
		// 1~10までの偶数が何個あるか、また偶数の合計は幾つになるか表示
		int odd_count = 0;
		int total = 0;
		for(int i = start; i <= end; i++) {
			if(i % 2 == 0) {
				odd_count += 1;
				total += i;
			}
		}
		System.out.println("偶数の数" + odd_count);
		System.out.println("偶数の和" + total);
		
		// 3問目
		// 1〜10までの整数をカンマ区切りで横並びで表示させる
		// (10にはカンマをつけない)
		for(int i = start; i <= end; i++) {
			System.out.print(i);
			if(i != end) {
				System.out.print(",");
			}
		}
		
		System.out.println();
		// 4問目
		// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
		// [0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
		int[] array = new int[20];
		int num = 0;
		
		for(int i = 0; i < 20; i++) {
			array[i] = num;
			num += 5;
			if(i <= 10 && i % 2 != 0) {
				System.out.print(array[i] + ",");
			} else if(i >= 11 && i % 2 == 0) {
				System.out.print(array[i] + ",");
			}
		}
	}

}
