package exception;

public class Exception03 {
	public static void main(String[] args) {
        try {
            Exception03.division(100, 0);
            
//		ArithmeticExceptionクラスは
//      算術計算で例外的条件が発生した場合にスローされます。
//      たとえば、整数を「ゼロで除算」するとこのクラスのインスタンスがスローされます。
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException例外が発生");
//      しかし今回はこの例外クラスではない。
        
//      IllegalArgumentException
//      不正な引数、または不適切な引数をメソッドに渡したことを示すためにスローされます。
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException例外が発生");
            throw e;
        }
        System.out.println("プログラム終了");
    }

    public static void division(int a, int b) {
        System.out.println(a + " ÷ " + b + " は？");
        if (b == 0) {
            throw new IllegalArgumentException("引数が不正です");
        }
        int result = a / b;
        System.out.println("計算結果" + result);
    }
}
