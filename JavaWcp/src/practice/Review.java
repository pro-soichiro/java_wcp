package practice;

public class Review {
	public static void main(String[] args) {
		String str = "間宮漱一朗";
		System.out.println(str);
		str = "治にいて、乱を忘れず";
		System.out.println(str);
		final int NUM = 24;
		System.out.println(NUM);
		
		long l = 123456789L;
		double d = 3.14159;
		boolean b = true;
		System.out.println(l);
		System.out.println(d);
		System.out.println(b);
		
		Float f = 3.141592F;
		Integer inte = 123456789;
		Character c = '間';
		System.out.println(f);
		System.out.println(inte);
		System.out.println(c);
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println(array[3]);
		
		for( int j = 0; j < array.length; j ++) {
			System.out.println(array[j]);
		}
		
		int val = 2 + 5;
		System.out.println(val);
//		インクリメント
		val ++;
		System.out.println(val);
		val *= 5;
		System.out.println(val);
		boolean bool = val == 50;
		System.out.println(bool);
		bool = val <= 50 && val % 10 == 0;
//		〇〇より小さいは x < 〇〇
//		よって
//		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
	
	
}