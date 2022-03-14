package practice;

public class Q_0103 {
	
	public static void main(String[] args) {
		
//		1~10までの整数をカンマ区切りで横並びに表示させる
		boolean fig = true;
		
		for(int i = 1; i <= 10; i++) {
			if(fig) {
				System.out.print(i);
				fig = false;
			} else {
				System.out.print("," + i);
			}
		}
		
	}
	
}
