package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class javaio_lessons {
	public static void main(String[] args) {
		try {
			// Fileのインスタンスを作成
			// File file = new File(パス名);
			File file = new File("resources/test.txt");
			File file_write = new File("resources/test_write.txt");
			// 文字ファイルを読み込むための簡易クラス
			// 引数はfile名
			FileReader filereader = new FileReader(file);
			FileWriter filewriter = new FileWriter(file_write);
			
			// 上記をまとめて下記にすることも可能
			// FileReader filereader = new FileReader(new File("resources/test.txt"));
			filewriter.write("こんにちは");
			filewriter.write("\n");
			filewriter.write("こんばんは");
			int ch;
			// read()
			// 単一の文字を読み込みます。
			// このメソッドは1文字が読み込まれるか、入出力エラーが発生するか、あるいはストリームの終わりに達するまでブロックします。
			// 戻り値は0 - 65535 (0x00-0xffff)の範囲の整数としての、読み込まれた文字。ストリームの終わりに達した場合は -1
			while ((ch = filereader.read()) != -1) {
				System.out.print((char)ch);
			}
			// 処理を終了するためにはclose()を使う。
			filereader.close();
			filewriter.close();
			
		// ファイルが見つからなかったときの例外
		} catch (FileNotFoundException e) {
			System.out.println(e);
		// 入出力エラーの時の例外
		} catch (IOException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
			
		}
	}
}
