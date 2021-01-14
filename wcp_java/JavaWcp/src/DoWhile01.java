
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 100;
		do {
			number *= 2;
			System.out.println("DoWhile01 =" + number);
		} while(number < 50);
//		条件式がブロックの後に来るので、条件式に当てはまらなくても最低一回のブロック処理は行われる
	}
}