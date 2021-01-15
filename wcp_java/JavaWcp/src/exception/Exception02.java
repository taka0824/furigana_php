package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 / 0は？");
			int result = 100 /0;
			System.out.println("集計結果" + result);
//			tryブロックには例外が発生する可能性がある処理を記述
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
//			catch は引数に例外クラス、変数名
//			ブロックに対象の例外が発生した時の処理を記述
		} finally {
			System.out.println("プログラム終了");
//			finallyは例外の有無に関わらず実行する処理
		}	
	}
}