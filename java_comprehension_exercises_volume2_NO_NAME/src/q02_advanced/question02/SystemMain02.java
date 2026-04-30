package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		List<Member> members = new ArrayList<>();
		members.add(Member.getInstance(1, "abc123", "sato", 23, 1));
		members.add(Member.getInstance(2, "bcd456", "tanaka", 25, 2));

		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");
		ConsoleReader cr = new ConsoleReader();
		int targetId;
		String newPassword;
		try {
			targetId = cr.inputNumber();
			newPassword = cr.inputString();
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newPassword);

		MemberManager.showAllMembers(members);

		Member member = new Member();

		// 各setterで値を設定
		int testId = 101;
		String testPassword = "default_pass";
		String testName = "デフォルトメンバー";
		int testAge = 20;
		int testRank = 5;

		member.setId(testId);
		member.setPassword(testPassword);
		member.setName(testName);
		member.setAge(testAge);
		member.setRank(testRank);

		System.out.println(member.getCoupons());
		System.out.println(member.getAge());

	}

}
