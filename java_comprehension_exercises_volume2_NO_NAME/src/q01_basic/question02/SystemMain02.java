package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member m[] = { new Member() };
		m[0].setName("Miura Manabu");
		m[0].setAge(30);
		m[0].setRank(1);
		m[0].showMember();
		m[0].rankUp();
		System.out.println("newRank:" + m[0].getRank());
	}
}
