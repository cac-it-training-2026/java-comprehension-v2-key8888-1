package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = { new Member(), new Member() };
		//TODO ここから実装する
		members[0].setId(1);
		members[0].setPassword("passw0rd");
		members[0].setName("miura Manabu");
		members[0].setAge(28);
		members[0].setRank(2);
		members[0].showMember();

		members[0].setId(2);
		members[0].setPassword("passw0rd");
		members[0].setName("Sato Kensuke");
		members[0].setAge(43);
		members[0].setRank(1);
		members[0].showMember();
	}

}
