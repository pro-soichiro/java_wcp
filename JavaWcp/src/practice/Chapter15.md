# Chapter15 演習問題

## 1 再帰の問題
最大公約数を「ユークリッドの互除法」で算出する再帰メソッドを呼び出して、以下の実行結果になるように「Chapter15_1.java」を作成してください。  

実行結果

```
976 と 427 の最大公約数は、61 です。
```

> <ユークリッドの互除法の計算方法>
>
> 大きい数を小さい数（割った数）で割り、割った数を余りで割ります。さらに割った数を余りで割り、余りが0になるまで計算します。余りが0になった時の割った数が最大公約数となります。

例）148 と 28 の最大公約数  
　148 % 28 = 16　← 大きい数（148）を小さい数（28）で割る  
　28 % 16 = 12　 ← 割った数（28）を余り（16）で割る  
　16 % 12 = 4 　 ← さらに割った数（16）を余り（12）で割る  
　12 % 4 = 0   　← さらに計算して、余りが0になった時の割った数（4）が最大公約数  

- 最大公約数  
幾つかの数の共通の約数のうち、最大のもの

```java
public class Chapter15_1 {
	public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
    		...
    }
}
```

### 処理内容
1. aとbがどちらが大きいかのチェック
1. 大きい数を小さい数で割ったあまりを算出する処理
1. 割った数を余りで割る処理
1. あまりが0になるまで3.のステップを繰り返す
1. あまりが0になったらその時割った数を数値として返す

#### Step3の方法
　148 % 28 = 16　← 大きい数（148）を小さい数（28）で割る  
	a % b = x
　28 % 16 = 12　 ← 割った数（28）を余り（16）で割る  
	b % x = y
ということは？
a %= bでいいのでは？

#### Step1は必要ない
なぜならば小さい数から大きい数を割った時のあまりは割られる数になるためである。

```java
System.out.println(976 / 427); //2
System.out.println(976 % 427); //122

System.out.println(427 / 976); //0
System.out.println(427 % 976); //427
```
