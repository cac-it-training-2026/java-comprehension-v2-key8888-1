package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member mem[] = { new Member(1, "abc123", "sato", 23, 1), new Member(2, "bcd456", "tanaka", 25, 2) };
		mem[0].showMember();
		mem[1].showMember();

	}

}
