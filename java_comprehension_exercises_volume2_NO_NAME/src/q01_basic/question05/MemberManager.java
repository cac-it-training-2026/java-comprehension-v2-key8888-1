package q01_basic.question05;

public class MemberManager {
	private MemberManager() {
		super();
	}

	public static void showAllMembers(AbstMember mems[]) {
		for (AbstMember m : mems) {
			m.showMember();
		}
	}

}
