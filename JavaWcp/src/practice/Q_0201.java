package practice;

public class Q_0201 {
	
	public static void main(String[] args) {
		
//		int型で変数を宣言し下記のように三関係を表示させるプログラムを作りなさい
//		変数が5の場合
//		*
//		**
//		***
//		****
//		*****
		
		int size = 5;
		
		for(int i = 1; i <= size; i++) {
			for( int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
//		int size = 5;
//		int count = 1;

//		while( count <= size ) {
//			
//			for( int i = 0; i < count; i++ ) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			count ++;
//			
//		}
		
	}
}
