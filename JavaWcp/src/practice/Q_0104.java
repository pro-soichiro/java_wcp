package practice;

public class Q_0104 {
	
	public static void main(String[] args) {
		
//		要素数が20の配列を宣言
//		要素に0から5ずつ加算して代入していく
//		0~10までの値の基数のみカンマ区切りで、11~19までの偶数をカンマ区切りで出力させる
//		基数：x,x,x,...
//		偶数：x,x,x,...
		
		int array[] = new int[20];
		int add = 0;
		boolean fig = true;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = add;
			add += 5;
		}
		
		System.out.print("奇数；");
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 != 0) {
				if(fig) {
					System.out.print(array[i]);	
					fig = false;
				} else {
					System.out.print("," + array[i]);
				}
			}
		}
		
		fig = true;
		System.out.println();
		System.out.print("偶数：");
		
		for(int i = 11; i < array.length; i++) {
			if(i % 2 == 0) {
				if(fig) {
					System.out.print(array[i]);	
					fig = false;
				} else {
					System.out.print("," + array[i]);
				}
			}
		}
		
	}
	
}
