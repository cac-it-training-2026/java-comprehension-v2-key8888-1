package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		super();
		this.memberStorage = memberStorage;
	}

	//TODO ここから処理を記述
	public Member doLogin(int id, String password) {
		for (Member ms : this.memberStorage.getMembers()) {
			if (ms.getId() == id && ms.getPassword().equals(password)) {
				return ms;
			}
		}
		return null;
	}
}
