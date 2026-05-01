package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		//		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		//		boolean isLogin = false;
		//TODO ここから実装する

		// 入力を求める
		ConsoleReader cr = new ConsoleReader();

		int id = 0;
		try {
			id = cr.inputNumber();
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		String password = null;
		try {
			password = cr.inputString();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		MemberStorage ms = new MemberStorage();
		LoginService ls = new LoginService(ms);

		Member member1 = null;

		while (true) {
			member1 = ls.doLogin(id, password);
			if (member1 == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
				id = 0;
				try {
					id = cr.inputNumber();
				} catch (NumberFormatException | IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				password = null;
				try {
					password = cr.inputString();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			} else {
				System.out.println("ログインに成功しました\nログインユーザ情報を表示します");
				break;
			}
		}

		System.out.println(member1);

	}

}
