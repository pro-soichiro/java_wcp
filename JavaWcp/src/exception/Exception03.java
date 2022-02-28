package exception;

public class Exception03 {
	public static void main(String[] args) {
        try {
            Exception03.division(100, 10);
            // 100 ÷ 10 は？
            // 計算結果10
            // プログラム終了
            Exception03.division(100, 0);
            // 100 ÷ 0 は？
            // IllegalArgumentException例外が発生
            // 引数が不正です
            
//		ArithmeticExceptionクラスは
//      算術計算で例外的条件が発生した場合にスローされます。
//      たとえば、整数を「ゼロで除算」するとこのクラスのインスタンスがスローされます。
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException例外が発生");
//      しかし今回はこの例外クラスではない。
        
//      IllegalArgumentException
//      不正な引数、または不適切な引数をメソッドに渡したことを示すためにスローされます。
        } catch (IllegalArgumentException e) {
        	// 例外処理が実行される
            System.out.println("IllegalArgumentException例外が発生");
            // キャッチした例外インスタンスをスロー
            throw e;
        }
        System.out.println("プログラム終了");
    }

    public static void division(int a, int b) {
        System.out.println(a + " ÷ " + b + " は？");
        if (b == 0) {
        	// bが0の時は意図的に引数エラーの例外をスローする
            throw new IllegalArgumentException("引数が不正です");
        }
        int result = a / b;
        System.out.println("計算結果" + result);
    }
}
