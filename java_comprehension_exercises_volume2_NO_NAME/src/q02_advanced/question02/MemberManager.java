package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	private MemberManager() {
		super();
	}

	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean find = false;
		for (Member m : members) {
			if (m.getId() == targetId) {
				m.setPassword(newPassword);
				find = true;
			}
		}
		if (!find) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
