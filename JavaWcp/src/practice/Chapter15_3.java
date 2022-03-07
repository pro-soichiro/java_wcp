package practice;

public class Chapter15_3 {
	public static void main(String[] args) {
        int i1 = 123;
        double d1 = i1;
        System.out.println(d1);

        double d2 = 12.345;
        int i2 = (int)d2;
        System.out.println(i2);

        int i3 = 1;
        int i4 = 2;
        double d3 = (double) i3 / i4;
//        int型同士の計算は計算結果もint型になり、小数点以下が切り捨てられてしまいます。
//        そのため、どちらかの変数を浮動小数型のdouble型にキャストして、計算結果をdouble型にする必要があります。
//        double d3 = (double)(i3 / i4);
        System.out.println(d3);

        int i5 = 128;
        byte b1 = (byte)i5;
        System.out.println(b1);
}
}
